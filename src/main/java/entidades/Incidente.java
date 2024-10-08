package entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="incident")
public class Incidente implements Serializable {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
    private String descripcion;
    @OneToMany(mappedBy = "incidente", cascade = CascadeType.ALL)
    private List<IncidenteTecnico> incidenteTecnicoList;
	public Incidente() {
		super();
	}
	public Integer getId() {
		return id;
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
	public List<IncidenteTecnico> getIncidenteTecnicoList() {
		return incidenteTecnicoList;
	}
	public void setIncidenteTecnicoList(List<IncidenteTecnico> incidenteTecnicoList) {
		this.incidenteTecnicoList = incidenteTecnicoList;
	}
    
    
}
