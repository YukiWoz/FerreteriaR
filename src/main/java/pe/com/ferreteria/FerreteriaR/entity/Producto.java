package pe.com.ferreteria.FerreteriaR.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Producto")
@Table(name="producto")
public class Producto implements Serializable
{

    private static final long serialVersionUID=1L;

    @Id
    @Column(name="codigopro")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long codigo;
     @Column(name="nombrepro")
    private String nombre;
      @Column(name="preciopro ")
    private double preciocompra;
       @Column(name="precioventapro")
    private double precioventa;
        @Column(name="cantidadpro")
    private double cantidad;
         @Column(name="estadopro")
    private boolean estado;
         @ManyToOne
         @JoinColumn(name="codigocat",nullable=false)
    private Categoria categoria;

}