/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.ferreteria.FerreteriaR.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import pe.com.ferreteria.FerreteriaR.entity.Usuario;
import pe.com.ferreteria.FerreteriaR.repositorio.UsuarioRepositorio;


public class UsuarioServcioImpl implements UsuarioServicio{
    
     @Autowired
    private UsuarioRepositorio repositorio;

    @Override
    public List<Usuario> FinAlld() {
       return repositorio.findAll();
    }

    @Override
    public List<Usuario> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<Usuario> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public Usuario add(Usuario p) {
       return repositorio.save(p);
    }

    @Override
    public Usuario update(Usuario p) {
        Usuario objempleado=repositorio.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objempleado);
        return repositorio.save(objempleado);    }

    @Override
    public Usuario delete(Usuario p) {
    Usuario objempleado=repositorio.getById(p.getCodigo());
    return repositorio.save(objempleado);    }
    
}
