
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
import pe.com.ferreteria.FerreteriaR.entity.Producto;
import pe.com.ferreteria.FerreteriaR.service.ProductoService;


@RestController
@RequestMapping("/producto")
public class ProductoRestController {

    @Autowired
    private ProductoService servicio;

    @GetMapping
    public List<Producto> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<Producto>finAllCustom(){
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<Producto>finById(@PathVariable long id){
     return servicio.findById(id);
    }

    @PostMapping
    public Producto add(@RequestBody Producto p){
        return servicio.add(p);
    }

    @PutMapping("/{id}")
    public Producto update(@PathVariable long id,@RequestBody Producto p){
        p.setCodigo(id);
        return servicio.update(p);
    }
     @DeleteMapping("/{id}")
    public Producto delete(@PathVariable long id){
        Producto objproducto=new Producto();
        objproducto.setEstado(false);
        return servicio.delete(Producto.builder().codigo(id).build());

    }

}
