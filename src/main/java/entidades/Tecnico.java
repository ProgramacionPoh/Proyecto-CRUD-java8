package entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tecnico")
public class Tecnico implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "nombre")
    private String nombre;


    @Column(name = "especialidad_id")
    private Integer especialidadId;
    
    @OneToOne
    @JoinColumn(name = "id")
    private Especialidad especialidad;

    @OneToMany(mappedBy = "tecnico")
    private List<IncidenteTecnico> incidentestecnicos;
    
	public Tecnico() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getEspecialidadId() {
		return especialidadId;
	}


	public void setEspecialidadId(Integer especialidadId) {
		this.especialidadId = especialidadId;
	}


	@Override
	public String toString() {
		return "Tecnico [id=" + id + ", nombre=" + nombre + ", especialidadId=" + especialidadId + ", especialidad="
				+ especialidad + ", incidentesTecnico="  + "]";
	}
	

}
