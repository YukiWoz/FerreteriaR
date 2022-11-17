package pe.com.ferreteria.FerreteriaR.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ferreteria.FerreteriaR.entity.Producto;
import pe.com.ferreteria.FerreteriaR.repositorio.ProductoRepositorio;

@Service
public class ProductoServiceImple implements ProductoService{

    @Autowired
  private ProductoRepositorio repositorio;

    @Override
    public List<Producto> findAll() {
    return repositorio.findAll();
    }

    @Override
    public List<Producto> findAllCustom() {
       return repositorio.findAllCustom();
    }

    @Override
    public Optional<Producto> findById(long id) {
     return repositorio.findById(id);
    }

    @Override
    public Producto add(Producto p) {
       return repositorio.save(p);
    }

    @Override
    public Producto update(Producto p) {
       Producto objproducto=repositorio.getById(p.getCodigo());
        BeanUtils.copyProperties(p,objproducto);
       return repositorio.save(objproducto);
    }

    @Override
    public Producto delete(Producto p) {
        Producto objproducto=repositorio.getById(p.getCodigo());

  objproducto.setEstado(false);
  return repositorio.save(objproducto);
    }

}
