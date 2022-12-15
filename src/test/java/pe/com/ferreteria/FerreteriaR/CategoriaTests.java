/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.ferreteria.FerreteriaR;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import pe.com.ferreteria.FerreteriaR.entity.Categoria;
import pe.com.ferreteria.FerreteriaR.repositorio.CategoriaRepositorio;

/**
 *
 * @author Usuario
 */
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class CategoriaTests {
    
    @Autowired
    private CategoriaRepositorio repositorio;
    
    @Test
    @Rollback(false)
    public void testGuardarCategoria(){
        Categoria categoria = new Categoria("Contruccion", true);
        Categoria categoriaGuardado = repositorio.save(categoria);
        
        assertNotNull(categoriaGuardado);
    }
    
    @Test
    public void testBuscarCategoriaPorNombre(){
        String nombre = "Prueba Any";
        Categoria categoria = repositorio.findByNombre(nombre);
        
        assertThat(categoria.getNombre()).isEqualTo(nombre);
    }
    
    @Test
    public void testBuscarCategoriaPorNombreNoExistente(){
        String nombre = "añá";
        Categoria categoria = repositorio.findByNombre(nombre);
        
        assertNull(categoria);
    }
    
    @Test
    @Rollback(false)
    public void testActualizarCategoria(){
        String nomcategoria = "jijija";//nuevo valor 
        Categoria categoria = new Categoria(nomcategoria,true);//valor nuevos
        categoria.setCodigo(16);//id del producto de modificar
        
        repositorio.save(categoria);
        
        Categoria categoriaActualizada = repositorio.findByNombre(nomcategoria);
        assertThat(categoriaActualizada.getNombre()).isEqualTo(nomcategoria);
    }
    
    @Test
    public void testListarCategoria(){
        List<Categoria> categorias = (List<Categoria>) repositorio.findAll();
        
        for(Categoria categoria:categorias){
            System.out.println(categoria);
        }
        assertThat(categorias).size().isGreaterThan(0);
    }
    
    
    
    
}
