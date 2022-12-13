/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.ferreteria.FerreteriaR.service;

import java.util.List;
import java.util.Optional;
import pe.com.ferreteria.FerreteriaR.entity.Boleta;
import pe.com.ferreteria.FerreteriaR.entity.Categoria;


public interface BoletaServicio {
    public  List<Boleta>findAll();
 public List<Boleta> findAllCustom();
   public Optional<Boleta>findById(long id);
   public Boleta add (Boleta b);
   public Boleta update(Boleta b);
  
     public Boleta delete(Boleta c);
   
}
