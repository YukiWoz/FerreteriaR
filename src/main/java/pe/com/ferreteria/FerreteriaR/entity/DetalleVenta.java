
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
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="DetalleVenta")
@Table(name="T_DetalleVenta")
public class DetalleVenta{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="iddetalle")
    private long codigo;
    @ManyToOne
    @JoinColumn(name = "idventa", nullable = false)
    private Venta venta;
    @ManyToOne
    @JoinColumn(name = "codpro", nullable = false)
    private Producto producto;
     @Column(name="canpro")
    private int cantidad;
     @Column(name="total_venta")
    private double totalventa;
     @Column(name="estdeven")
    private boolean estado;
    
}
