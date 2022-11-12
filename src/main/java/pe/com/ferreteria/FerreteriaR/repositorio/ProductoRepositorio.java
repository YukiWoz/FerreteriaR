package pe.com.ferreteria.FerreteriaR.repositorio;

public interface ProductoRepositorio{
    
}
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.com.ferreteria.FerreteriaR.entity.Producto;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Long>{
    @Query("select p from Producto p where p.estado='1'")
    List<Producto>findAllCustom();
}