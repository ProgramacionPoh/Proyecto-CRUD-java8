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
@Table(name="client")
public class Cliente implements Serializable {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @OneToMany(mappedBy = "cliente")
    private List<Incidente> incidentes;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public List<Incidente> getIncidentes() {
		return incidentes;
	}


	public void setIncidentes(List<Incidente> incidentes) {
		this.incidentes = incidentes;
	}


	@Override
	public String toString() {
		return "Cliente [id=" + id + "]";
	}


	public Cliente() {
		super();
	}

    
}
