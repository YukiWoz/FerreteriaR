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
import pe.com.ferreteria.FerreteriaR.entity.Perfil;
import pe.com.ferreteria.FerreteriaR.repositorio.PerfilRepositorio;

@Service
public class PerfilServiceImple implements PerfilServicio{
    
@Autowired
private PerfilRepositorio repositorio;

    @Override
    public List<Perfil> FinAlld() {
        return repositorio.findAll();
    }

    @Override
    public List<Perfil> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<Perfil> findById(long id) {
        return repositorio.findById(id);

    }
    

    @Override
    public Perfil add(Perfil p) {
       return repositorio.save(p);
    }

    @Override
    public Perfil update(Perfil p) {
      Perfil perfil=repositorio.getById(p.getCodigo());
        BeanUtils.copyProperties(p,perfil);
       return repositorio.save(perfil);  
          }

    @Override
    public Perfil delete(Perfil p) {
        Perfil perfil=repositorio.getById(p.getCodigo());
          
        perfil.setEstado(false);
  return repositorio.save(perfil);
    

    }
    
}
