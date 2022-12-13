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

import pe.com.ferreteria.FerreteriaR.entity.Cliente;
import pe.com.ferreteria.FerreteriaR.entity.DetalleVenta;
import pe.com.ferreteria.FerreteriaR.repositorio.DetalleVentaRepositorio;

/**
 *
 * @author lisbet
 */
@Service
public class DetalleServicioImpl implements DetalleServicio{
    
@Autowired
private DetalleVentaRepositorio repositorio;

    @Override
    public List<DetalleVenta> FinAlld() {
        return repositorio.findAll();
    }

    @Override
    public Optional<DetalleVenta> findById(long id) {
        return repositorio.findById(id);

    }
    

    @Override
    public DetalleVenta add(DetalleVenta p) {
       return repositorio.save(p);
    }

    @Override
    public DetalleVenta update(DetalleVenta p) {
      DetalleVenta perfil=repositorio.getById(p.getCodigo());
        BeanUtils.copyProperties(p,perfil);
       return repositorio.save(perfil);  
          }

    @Override
    public List<DetalleVenta> findAllCustom() {
      return repositorio.findAll();
    }

    @Override
    public DetalleVenta delete(DetalleVenta c) {
    DetalleVenta objcategoria=repositorio.getById(c.getCodigo());
     objcategoria.setEstado(false);
     return repositorio.save(objcategoria);
    }

}
