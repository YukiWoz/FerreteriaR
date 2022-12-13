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
import pe.com.ferreteria.FerreteriaR.repositorio.ClienteRepositorio;

/**
 *
 * @author lisbet
 */
@Service
public class ClienteServcioImpl implements ClienteServicio{
    @Autowired
    private ClienteRepositorio repositorio;
    
    @Override
    public List<Cliente> findAll() {
      return repositorio.findAll();
    }

    @Override
    public Optional<Cliente> findById(long id) {
       return repositorio.findById(id);
    }

    @Override
    public Cliente add(Cliente c) {
    return repositorio.save(c);
    }

    @Override
    public Cliente update(Cliente c) {
      Cliente objcliente=repositorio.getById(c.getCodigo());
        BeanUtils.copyProperties(c,objcliente);
        return repositorio.save(objcliente);
    }

    @Override
    public List<Cliente> findAllCustom() {
      return repositorio.findAllCustom();
    }

    @Override
    public Cliente delete(Cliente c) {
          Cliente objcategoria=repositorio.getById(c.getCodigo());
  objcategoria.setEstado(false);
  return repositorio.save(objcategoria);
  
    }

   
}
