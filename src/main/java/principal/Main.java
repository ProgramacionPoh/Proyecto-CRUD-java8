package principal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import dao.DaoCliente;
import dao.DaoEspecialidad;
import dao.DaoTecnico;
import entidades.Cliente;
import entidades.Especialidad;
import entidades.Tecnico;

public class Main {

	public static void main(String[] args) {

		Cliente usuario1 = new Cliente();
		usuario1.setCuit("20-33444556-4");
		usuario1.setRazonSocial("Municipio");
		usuario1.setId(1);
	
		
		Tecnico usuario2 = new Tecnico();
		usuario2.setNombre("Joaquin");
		usuario2.setEspecialidadId(1);
		usuario2.setNombre("Joaquin");
		
		Especialidad usuario3 = new Especialidad();
		usuario3.setNombre("Ingeniero");
		usuario3.setId(1);
		
		DaoCliente dao1 = new DaoCliente();
		dao1.Add(usuario1);
		System.out.println("Insertado con exito\n --------");
		DaoTecnico dao = new DaoTecnico();
		dao.Add(usuario2);
		System.out.println("Insertado con exito n°2\n --------");
		DaoEspecialidad dao3 = new DaoEspecialidad();
		dao3.Add(usuario3);
		System.out.println("Insertado con exiton°3\n --------");
}}
