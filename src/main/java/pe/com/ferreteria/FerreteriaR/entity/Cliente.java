
package pe.com.ferreteria.FerreteriaR.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Cliente")
@Table(name="t_cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="codcli")
    private long codigo;
    @Column(name="nomcli")
    private String nombre;
    @Column(name="apepcli")
    private String apellidopaterno;
    @Column(name="apemcli")
    private String apellidomaterno;
    @Column(name="dnicli")
    private String dni;
    @Column(name="celcli")
    private String celular;
     @Column(name="sexcli")
    private String sexo;
      @Column(name="estcli")
    private boolean estado;
}
