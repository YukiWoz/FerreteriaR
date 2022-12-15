
package pe.com.ferreteria.FerreteriaR;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import pe.com.ferreteria.FerreteriaR.entity.Perfil;
import static  org.assertj.core.api.Assertions.assertThat;
import pe.com.ferreteria.FerreteriaR.entity.Producto;
import pe.com.ferreteria.FerreteriaR.repositorio.PerfilRepositorio;
import pe.com.ferreteria.FerreteriaR.repositorio.ProductoRepositorio;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class ProductoTest {
    @Autowired
    private PerfilRepositorio repositorio;
    
   @Test
   @Rollback(false)
   public void testGuardarProducto(){
   Perfil perfil=new Perfil("JPA", true);
   Perfil perfilguardado=repositorio.save(perfil);
       Assertions.assertNotNull(perfilguardado);
   }
 
}
