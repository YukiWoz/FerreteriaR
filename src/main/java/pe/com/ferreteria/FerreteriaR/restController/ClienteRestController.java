
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
import pe.com.ferreteria.FerreteriaR.entity.Categoria;
import pe.com.ferreteria.FerreteriaR.entity.Cliente;
import pe.com.ferreteria.FerreteriaR.service.ClienteServicio;


 @RestController
@RequestMapping("/cliente")
public class ClienteRestController {


     @Autowired
     private ClienteServicio servcio;
     
    
     @GetMapping
     public List<Cliente>findAll(){
     return  servcio.findAll();
     
     }
     
    @GetMapping("/custom")
    public List<Cliente> finAllCustom() {
        return servcio.findAllCustom();
    }
    
     @GetMapping("/{id}")
     public Optional<Cliente>findByd(@PathVariable long id){
     return servcio.findById(id);
     }
     
     @PostMapping
     public Cliente add(@RequestBody Cliente c){
     return servcio.add(c);
     }
     
     @PutMapping("/{id}")
     public Cliente update(@PathVariable long id ,@RequestBody Cliente c){
         c.setCodigo(id);
         return servcio.update(c);
     
     }
  
   
  @DeleteMapping("/{id}")
    public Cliente delete(@PathVariable long id) {
        Cliente objcategoria = new Cliente();
        objcategoria.setEstado(false);
        return servcio.delete(Cliente.builder().codigo(id).build());

    }
    
     
}