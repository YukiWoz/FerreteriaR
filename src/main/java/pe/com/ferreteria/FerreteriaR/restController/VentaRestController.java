
package pe.com.ferreteria.FerreteriaR.restController;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.ferreteria.FerreteriaR.entity.Venta;
import pe.com.ferreteria.FerreteriaR.service.VentaServicio;

@RestController
@RequestMapping("/venta")
public class VentaRestController {
     @Autowired
    private VentaServicio servicio;

    @GetMapping
    public List<Venta> findAll() {
        return servicio.findAll();
    }
  
    
    @GetMapping("/{id}")
    public Optional<Venta>finById(@PathVariable long id){
     return servicio.findById(id);
    }
    
    @PostMapping
    public Venta add(@RequestBody Venta c){
        return servicio.add(c);
    }
    
    @PutMapping("/{id}")
    public Venta update(@PathVariable long id,@RequestBody Venta c){
        c.setCodigo(id);
        return servicio.update(c);
    }
    
    @DeleteMapping("/{id}")
    public void elimina(@PathVariable("id")long id)
    {
    servicio.eliminar(id);
    
    }
    
}
