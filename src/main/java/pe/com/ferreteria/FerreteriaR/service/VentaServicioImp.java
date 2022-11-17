/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.ferreteria.FerreteriaR.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ferreteria.FerreteriaR.entity.Venta;
import pe.com.ferreteria.FerreteriaR.repositorio.VentaRepositorio;

@Service
public class VentaServicioImp implements  VentaServicio{

    @Autowired
    private VentaRepositorio repositorio;
    @Override
    public List<Venta> findAll() {
        return repositorio.findAll();
    }

    @Override
    public Optional<Venta> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public Venta add(Venta c) {
       return repositorio.save(c);
    }

    @Override
    public Venta update(Venta c) {
Venta objproducto=repositorio.getById(c.getCodigo());
        BeanUtils.copyProperties(c,objproducto);
       return repositorio.save(objproducto);
    }

    @Override
    public void eliminar(long id) {
      repositorio.deleteById(id);
    }
    
    
}
