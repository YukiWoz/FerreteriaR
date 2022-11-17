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
import pe.com.ferreteria.FerreteriaR.entity.Usuario;
import pe.com.ferreteria.FerreteriaR.service.UsuarioServicio;

/**
 *
 * @author Usuario
 */
@RestController
@RequestMapping("/usuario")
public class UsuarioRestController {
    @Autowired
    private UsuarioServicio servicio;
   
    @GetMapping
    public List<Usuario>findAll() {
        return servicio.FinAlld();
    }
 
   @GetMapping("/custom")
    public List<Usuario>finAllCustom(){
        return servicio.findAllCustom();
    }
       
    @GetMapping("/{id}")
    public Optional<Usuario>finById(@PathVariable long id){
     return servicio.findById(id);
    }
    
    @PostMapping
    public Usuario add(@RequestBody Usuario p){
        return servicio.add(p);
    }
    
    @PutMapping("/{id}")
    public Usuario update(@PathVariable long id,@RequestBody Usuario p){
        p.setCodigo(id);
        return servicio.update(p);
    }
     @DeleteMapping("/{id}")
    public Usuario delete(@PathVariable long id){
        Usuario objproducto=new Usuario();
        return servicio.delete(Usuario.builder().codigo(id).build());
        
    }
}
