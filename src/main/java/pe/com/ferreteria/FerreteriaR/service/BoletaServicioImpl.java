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
import pe.com.ferreteria.FerreteriaR.entity.Boleta;
import pe.com.ferreteria.FerreteriaR.repositorio.BoletaRepoitorio;

@Service
public class BoletaServicioImpl implements BoletaServicio{

    @Autowired
    
    private BoletaRepoitorio repositorio;
    @Override
    public List<Boleta> findAll() {
    return repositorio.findAll();
    }

    @Override
    public Optional<Boleta> findById(long id) {
       return repositorio.findById(id);
    }

    @Override
    public Boleta add(Boleta b) {
        return repositorio.save(b);
    }

    @Override
    public Boleta update(Boleta b) {
       Boleta objBoleta=repositorio.getById(b.getCodigo());
       BeanUtils.copyProperties(b,objBoleta);
       return repositorio.save(objBoleta);
    }

   
 
    @Override
    public List<Boleta> findAllCustom() {
      return repositorio.findAllCustom();
    }

    @Override
    public Boleta delete(Boleta c) {
           Boleta objcategoria=repositorio.getById(c.getCodigo());
  objcategoria.setEstado(false);
  return repositorio.save(objcategoria);

    }
    
}