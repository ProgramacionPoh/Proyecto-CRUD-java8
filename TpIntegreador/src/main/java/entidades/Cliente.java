package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente implements Serializable {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

	@Column(name = "dni")
	private Integer dni;
	
	@Column(name = "domicilio")
	private String domicilio;
	
	@Column(name = "localidad")
	private String localidad;
	
	@Column(name = "mail")
	private String mail;

    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "apellido")
    private String apellido;

    @Column(name = "razon_social")
    private String razonSocial;

    @Column(name = "cuit")
    private String cuit;


	public Cliente() {
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


	public String getRazonSocial() {
		return razonSocial;
	}


	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}


	public String getCuit() {
		return cuit;
	}

	

	public Integer getDni() {
		return dni;
	}


	public void setDni(Integer dni) {
		this.dni = dni;
	}


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public void setCuit(String cuit) {
		this.cuit = cuit;
	}	

	public Cliente(Integer dni, String domicilio, String localidad, String mail, String nombre, String apellido,
			String razonSocial, String cuit) {
		super();
		this.dni = dni;
		this.domicilio = domicilio;
		this.localidad = localidad;
		this.mail = mail;
		this.nombre = nombre;
		this.apellido = apellido;
		this.razonSocial = razonSocial;
		this.cuit = cuit;
	}


	@Override
	public String toString() {
		return "Cliente [id=" + id + ", dni=" + dni + ", domicilio=" + domicilio + ", localidad=" + localidad
				+ ", mail=" + mail + ", nombre=" + nombre + ", apellido=" + apellido + ", razonSocial=" + razonSocial
				+ ", cuit=" + cuit + "]";
	}
	
}
