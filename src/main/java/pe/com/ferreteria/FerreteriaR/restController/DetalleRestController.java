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
import pe.com.ferreteria.FerreteriaR.entity.Cliente;
import pe.com.ferreteria.FerreteriaR.entity.DetalleVenta;
import pe.com.ferreteria.FerreteriaR.service.DetalleServicio;

@RestController
@RequestMapping("/detalle")
public class DetalleRestController {
    
     @Autowired
    private DetalleServicio servicio;

    @GetMapping
    public List<DetalleVenta> findAll() {
        return servicio.FinAlld();
    }
     
    @GetMapping("/custom")
    public List<DetalleVenta> finAllCustom() {
        return servicio.findAllCustom();
    }
    
  
    
    @GetMapping("/{id}")
    public Optional<DetalleVenta>finById(@PathVariable long id){
     return servicio.findById(id);
    }
    
    @PostMapping
    public DetalleVenta add(@RequestBody DetalleVenta p){
        return servicio.add(p);
    }
    
    @PutMapping("/{id}")
    public DetalleVenta update(@PathVariable long id,@RequestBody DetalleVenta p){
        p.setCodigo(id);
        return servicio.update(p);
    }
     @DeleteMapping("/{id}")
    public DetalleVenta delete(@PathVariable long id) {
        DetalleVenta objcategoria = new DetalleVenta();
        objcategoria.setEstado(false);
        return servicio.delete(DetalleVenta.builder().codigo(id).build());

    }
}
