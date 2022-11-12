package pe.com.ferreteria.FerreteriaR.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.com.ferreteria.FerreteriaR.entity.Categoria; 


@Repository
public interface CategoriaRepositorio extends JpaRepository<Categoria, Long>
{
     @Query("select c from Categoria c where c.estado='1'")
    List<Categoria>findAllCustom();


}
