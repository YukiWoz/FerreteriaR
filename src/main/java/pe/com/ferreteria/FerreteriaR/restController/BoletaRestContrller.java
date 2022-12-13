
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
import pe.com.ferreteria.FerreteriaR.entity.Boleta;
import pe.com.ferreteria.FerreteriaR.service.BoletaServicio;


@RestController
@RequestMapping("/boleta")
public class BoletaRestContrller {
    
      @Autowired
     private BoletaServicio servcio;
     
     @GetMapping
     public List<Boleta>findAll(){
     return  servcio.findAll();
     
     }
    
    @GetMapping("/custom")
    public List<Boleta> finAllCustom() {
        return servcio.findAllCustom();
    }
    
     @GetMapping("/{id}")
     public Optional<Boleta>findByd(@PathVariable long id){
     return servcio.findById(id);
     }
     @PostMapping
     public Boleta add(@RequestBody Boleta c){
     return servcio.add(c);
     }
     
     @PutMapping("/{id}")
     public Boleta update(@PathVariable long id ,@RequestBody Boleta c){
         c.setCodigo(id);
         return servcio.update(c);
     
     }
      
    @DeleteMapping("/{id}")
    public Boleta delete(@PathVariable long id) {
        Boleta objcategoria = new Boleta();
        objcategoria.setEstado(false);
        return servcio.delete(Boleta.builder().codigo(id).build());

    }
     
    
}
