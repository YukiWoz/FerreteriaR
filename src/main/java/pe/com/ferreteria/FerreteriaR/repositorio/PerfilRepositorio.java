/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.ferreteria.FerreteriaR.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.ferreteria.FerreteriaR.entity.Perfil;

/**
 *
 * @author Usuario
 */
public interface PerfilRepositorio extends JpaRepository<Perfil, Long> {
    public Perfil findByNombre(String nombre);
    @Query("select c from Perfil c where c.estado='1'")
         List<Perfil>findAllCustom();
         
}
