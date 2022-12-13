/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.ferreteria.FerreteriaR.service;

import java.util.List;
import java.util.Optional;
import pe.com.ferreteria.FerreteriaR.entity.Cliente;
import pe.com.ferreteria.FerreteriaR.entity.DetalleVenta;

public interface DetalleServicio {
     public List<DetalleVenta>FinAlld();
    public List<DetalleVenta> findAllCustom();
    public Optional<DetalleVenta> findById(long id);

    public DetalleVenta add(DetalleVenta p);

    public DetalleVenta update(DetalleVenta p);
     public DetalleVenta delete(DetalleVenta c);

    
}
