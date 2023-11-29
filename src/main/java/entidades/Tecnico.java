package entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="tecnico")
public class Tecnico implements Serializable{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nombre")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String name;

	@OneToMany(mappedBy = "tecnico", cascade = CascadeType.ALL)
	private List<IncidenteTecnico> incidenteTecnicoList;

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<IncidenteTecnico> getIncidenteTecnicoList() {
		return incidenteTecnicoList;
	}

	public void setIncidenteTecnicoList(List<IncidenteTecnico> incidenteTecnicoList) {
		this.incidenteTecnicoList = incidenteTecnicoList;
	}

	public Tecnico() {
		super();
	}

	@Override
	public String toString() {
		return "Tecnico [id=" + id + ", name=" + name + "]";
	}
	
	

}
