package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "incidente_tecnico")
public class IncidenteTecnico {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "tecnico_id")
	private Tecnico tecnico;

    @ManyToOne
    @JoinColumn(name = "incidente_id")
    private Incidente incidente;

	public IncidenteTecnico() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Incidente getIncidente() {
		return incidente;
	}


	public void setIncidente(Incidente incidente) {
		this.incidente = incidente;
	}



	@Override
	public String toString() {
		return "IncidenteTecnico [id=" + id + ", incidente=" + incidente + ", tecnico=" + "]";
	}
	
	
}
