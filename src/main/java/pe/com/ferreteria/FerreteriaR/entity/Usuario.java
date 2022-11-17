
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
@Entity(name ="Usuario")
@Table(name = "T_Usuario")
public class Usuario {
    @Id
    @Column(name = "idusuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    
    @Column(name = "nombreus")
    private String nombre;
    @Column(name = "apeus")
    private String apellido;
    @Column(name = "clave")
    private String clave;
    @Column(name = "coremp")
    private String correo;
    @ManyToOne
    @JoinColumn(name = "codper", nullable = false)
    private Perfil perfil;

}
