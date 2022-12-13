
package pe.com.ferreteria.FerreteriaR.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.ferreteria.FerreteriaR.entity.DetalleVenta;


public interface DetalleVentaRepositorio extends JpaRepository<DetalleVenta, Long>{
     @Query("select c from DetalleVenta c where c.estado='1'")
    List<DetalleVenta>findAllCustom();

    
}
