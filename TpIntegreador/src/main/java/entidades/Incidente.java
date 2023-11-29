package entidades;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="incidente")
public class Incidente implements Serializable {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
    @Column(name = "descripcion")
    private String descripcion;


    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_especialidad")
    private Especialidad especialidad;
    
    @Column(name="fecha_reporte")
    private LocalDateTime fechaReporte;
    
    @Column(name="fecha_resuelto")
    private LocalDateTime fechaResuelto;
    
    @Column(name="resuelto")
    private Integer resuelto;  
    
    @ManyToOne
    @JoinColumn(name = "id_operador")
    private Operador operador;

	public Incidente() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public Operador getOperador() {
		return operador;
	}


	public void setOperador(Operador operador) {
		this.operador = operador;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Especialidad getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}


	public LocalDateTime getFechaReporte() {
		return fechaReporte;
	}


	public void setFechaReporte(LocalDateTime fechaReporte) {
		this.fechaReporte = fechaReporte;
	}


	public LocalDateTime getFechaResuelto() {
		return fechaResuelto;
	}


	public void setFechaResuelto(LocalDateTime fechaResuelto) {
		this.fechaResuelto = fechaResuelto;
	}


	public Integer getResuelto() {
		return resuelto;
	}


	public void setResuelto(Integer resuelto) {
		this.resuelto = resuelto;
	}


	
	public Incidente(String descripcion, Cliente cliente, Especialidad especialidad, LocalDateTime fechaReporte,
			LocalDateTime fechaResuelto, Integer resuelto, Operador operador) {
		super();
		this.descripcion = descripcion;
		this.cliente = cliente;
		this.especialidad = especialidad;
		this.fechaReporte = fechaReporte;
		this.fechaResuelto = fechaResuelto;
		this.resuelto = resuelto;
		this.operador = operador;
	}



	@Override
	public String toString() {
		return "Incidente [id=" + id + ", descripcion=" + descripcion + ", cliente=" + cliente + ", especialidad="
				+ especialidad + ", fechaReporte=" + fechaReporte + ", fechaResuelto=" + fechaResuelto + ", resuelto="
				+ resuelto + operador +"]";
	}
	
}
