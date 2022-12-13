
package pe.com.ferreteria.FerreteriaR.service;

import java.util.List;
import java.util.Optional;

import pe.com.ferreteria.FerreteriaR.entity.Cliente;

public interface ClienteServicio {
    
     public List<Cliente>findAll();
   public List<Cliente> findAllCustom();
    public Optional<Cliente>findById(long id);
    public Cliente add(Cliente c);
    public Cliente update(Cliente c);
     public Cliente delete(Cliente c);
}
