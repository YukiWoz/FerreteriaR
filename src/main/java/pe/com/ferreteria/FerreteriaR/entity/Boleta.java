/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.ferreteria.FerreteriaR.entity;

import java.util.Date;
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
@Entity(name = "Boleta")
@Table(name = "T_Boleta")
public class Boleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nrotic")
    private long codigo;
    @ManyToOne
    @JoinColumn(name = "idusuario", nullable = false)
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "codcli", nullable = false)
    private Cliente cliente;

    @Column(name = "fectic")
    private Date fecha;
    @ManyToOne
    @JoinColumn(name = "codventa", nullable = false)
    private Venta venta;
    @Column(name = "estbol")
    private boolean estado;
}
