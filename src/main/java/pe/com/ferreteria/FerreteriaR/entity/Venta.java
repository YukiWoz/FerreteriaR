
package pe.com.ferreteria.FerreteriaR.entity;

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
@Entity( name="Venta")
@Table(name= "t_venta")
public class Venta {
   
    @Id
    @Column(name="codventa")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long codigo;
 @ManyToOne
     @JoinColumn(name="codpro",nullable=false)
    private Producto producto ;
@Column(name="canpro")
    private Integer cantidad;
@Column(name="subtotal")
    private float subtotal;
    @Column(name="igv")
    private float igv;
    @Column(name="total_venta")
    private float total; 
    @Column(name="estven")
    private boolean estado;
}
