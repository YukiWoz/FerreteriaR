/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.ferreteria.FerreteriaR.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.ferreteria.FerreteriaR.entity.Venta;


public interface VentaRepositorio extends  JpaRepository<Venta, Long>{
    
    
}
