/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.ferreteria.FerreteriaR.service;

import java.util.List;
import java.util.Optional;
import pe.com.ferreteria.FerreteriaR.entity.Venta;

/**
 *
 * @author lisbet
 */
public interface VentaServicio {
     public List<Venta>findAll();

    public Optional<Venta> findById(long id);

    public Venta add(Venta c);

    public Venta update(Venta c);

  public void eliminar(long id);
  
}
