package entidades;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tecnico")
public class Tecnico implements Serializable{
	
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

    @ManyToOne
    @JoinColumn(name = "especialidad_id")
    private Especialidad especialidad;
    
   
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="tecnico_x_incidente", joinColumns= {@JoinColumn(name="tecnico_id")}, inverseJoinColumns= {@JoinColumn(name="incidente_id")})
    private Set<Incidente> listaIncidentes = new HashSet<Incidente>();
    
    @Column(name="cuit")
    private String Cuit;
    
    @Column(name="telfono")
    private Integer Telefono;
    
    
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


	public Especialidad getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}


	public Set<Incidente> getListaAlumnos() {
		return listaIncidentes;
	}


	public void setListaAlumnos(Set<Incidente> listaIncidentes) {
		this.listaIncidentes = listaIncidentes;
	}


	public String getCuit() {
		return Cuit;
	}


	public void setCuit(String cuit) {
		Cuit = cuit;
	}


	public Integer getTelefono() {
		return Telefono;
	}


	public void setTelefono(Integer telefono) {
		Telefono = telefono;
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



	public Set<Incidente> getListaIncidentes() {
		return listaIncidentes;
	}



	public void setListaIncidentes(Set<Incidente> listaIncidentes) {
		this.listaIncidentes = listaIncidentes;
	}



	public Tecnico(Integer dni, String domicilio, String localidad, String mail, String nombre, String apellido,
			Especialidad especialidad, Integer especialidadId, String cuit, Integer telefono) {
		super();
		this.dni = dni;
		this.domicilio = domicilio;
		this.localidad = localidad;
		this.mail = mail;
		this.nombre = nombre;
		this.apellido = apellido;
		this.especialidad = especialidad;
		Cuit = cuit;
		Telefono = telefono;
	}



	@Override
	public String toString() {
		return "Tecnico [id=" + id + ", dni=" + dni + ", domicilio=" + domicilio + ", localidad=" + localidad
				+ ", mail=" + mail + ", nombre=" + nombre + ", apellido=" + apellido + ", especialidad=" + especialidad
				+ ", especialidadId=" + ", listaIncidentes=" + listaIncidentes + ", Cuit=" + Cuit
				+ ", Telefono=" + Telefono + "]";
	}

}
