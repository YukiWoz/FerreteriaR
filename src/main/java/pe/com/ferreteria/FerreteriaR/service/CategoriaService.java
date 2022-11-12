package pe.com.ferreteria.FerreteriaR.service;

import java.util.List;
import java.util.Optional;
import pe.com.ferreteria.FerreteriaR.entity.Categoria;

public interface CategoriaService {

    public List<Categoria>findAll();

   public List<Categoria> findAllCustom();

    public Optional<Categoria> findById(long id);

    public Categoria add(Categoria c);

    public Categoria update(Categoria c);

    public Categoria delete(Categoria c);

}
