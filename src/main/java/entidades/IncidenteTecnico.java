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
    @JoinColumn(name = "incidente_id")
    private Incidente incidente;


    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    private Tecnico tecnico;


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


	public Tecnico getTecnico() {
		return tecnico;
	}


	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
	
	
}
