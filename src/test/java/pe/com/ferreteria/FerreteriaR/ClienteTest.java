/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.ferreteria.FerreteriaR;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import pe.com.ferreteria.FerreteriaR.entity.Cliente;
import pe.com.ferreteria.FerreteriaR.repositorio.ClienteRepositorio;

/**
 *
 * @author Usuario
 */
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class ClienteTest {
    
    @Autowired
    private ClienteRepositorio repositorio;
    
    @Test
    @Rollback(false)
    public void testGuardarCliente(){
        Cliente cliente = new Cliente("maicol", "Aquiles","Castro","1234567","987654321", "M" ,true);
        Cliente clienteGuardado = repositorio.save(cliente);
        
        assertNotNull(clienteGuardado);
    }
    
    @Test
    public void testBuscarClienteporNombre(){
        String nombre = "Charito";
        Cliente cliente = repositorio.findByNombre(nombre);
        
        assertThat(cliente.getNombre()).isEqualTo(nombre);
    }
    
    @Test
    public void testBuscarClientePorNombreNoExistente(){
        String nombre = "Charito";
        Cliente cliente = repositorio.findByNombre(nombre);
        
        assertNull(cliente);
    }
    
    @Test
    @Rollback(false)
    public void testActualizarCategoria(){
        String nomcliente = "jijija";//nuevo valor 
        Cliente cliente = new Cliente("maicol", "Mongol","Castro","12345678","987654321", "M" ,true);//valor nuevos
        cliente.setCodigo(13);//id del producto de modificar
        
        repositorio.save(cliente);
        
        Cliente ClienteActualizada = repositorio.findByNombre(nomcliente);
        assertThat(ClienteActualizada.getNombre()).isEqualTo(nomcliente);
    }
    
}
