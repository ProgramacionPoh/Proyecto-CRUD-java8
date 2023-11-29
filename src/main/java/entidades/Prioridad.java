package entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="priority")
public class Prioridad implements Serializable {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToMany(mappedBy = "prioridad")
    private List<Incidente> incidentes;


	public Prioridad() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public List<Incidente> getIncidentes() {
		return incidentes;
	}


	public void setIncidentes(List<Incidente> incidentes) {
		this.incidentes = incidentes;
	}
    

	
}
