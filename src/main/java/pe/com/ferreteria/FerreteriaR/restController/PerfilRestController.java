/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
import pe.com.ferreteria.FerreteriaR.entity.Perfil;
import pe.com.ferreteria.FerreteriaR.service.PerfilServicio;

@RestController
@RequestMapping("/perfil")
public class PerfilRestController {
      @Autowired
    private PerfilServicio servicio;

    @GetMapping
    public List<Perfil> findAll() {
        return servicio.FinAlld();
    }
    @GetMapping("/custom")
    public List<Perfil>finAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Perfil>finById(@PathVariable long id){
     return servicio.findById(id);
    }
    
    @PostMapping
    public Perfil add(@RequestBody Perfil p){
        return servicio.add(p);
    }
    
    @PutMapping("/{id}")
    public Perfil update(@PathVariable long id,@RequestBody Perfil p){
        p.setCodigo(id);
        return servicio.update(p);
    }
     @DeleteMapping("/{id}")
    public Perfil delete(@PathVariable long id){
        Perfil objproducto=new Perfil();
        objproducto.setEstado(false);
    return servicio.delete(Perfil.builder().codigo(id).build());
        
    }
    
}
