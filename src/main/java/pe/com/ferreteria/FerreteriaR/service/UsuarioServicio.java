/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.ferreteria.FerreteriaR.service;

import java.util.List;
import java.util.Optional;
import pe.com.ferreteria.FerreteriaR.entity.DetalleVenta;
import pe.com.ferreteria.FerreteriaR.entity.Usuario;


public interface UsuarioServicio {
    public List<Usuario>FinAlld();
      public List<Usuario> findAllCustom();
    public Optional<Usuario>findById(long id);
    public Usuario add (Usuario p);
    public Usuario update(Usuario p);
    public Usuario delete(Usuario c);
   
}
