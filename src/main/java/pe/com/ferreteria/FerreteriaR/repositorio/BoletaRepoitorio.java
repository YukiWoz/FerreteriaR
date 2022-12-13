/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.ferreteria.FerreteriaR.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.ferreteria.FerreteriaR.entity.Boleta;


public interface BoletaRepoitorio  extends JpaRepository<Boleta, Long>{
     @Query("select c from Boleta c where c.estado='1'")
    List<Boleta>findAllCustom();

}
