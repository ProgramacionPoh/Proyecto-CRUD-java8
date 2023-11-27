package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name="client")
public class Cliente implements Serializable {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "razon_social")
    private String razonSocial;

    @Column(name = "cuit")
    private String cuit;


	public Cliente() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getRazonSocial() {
		return razonSocial;
	}


	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}


	public String getCuit() {
		return cuit;
	}


	public void setCuit(String cuit) {
		this.cuit = cuit;
	}


	@Override
	public String toString() {
		return "Cliente [id=" + id + ", razonSocial=" + razonSocial + ", cuit=" + cuit + "]";
	}

    
}
