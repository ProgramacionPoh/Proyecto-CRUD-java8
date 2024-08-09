package principal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import dao.ConfigHibernate;
import dao.DaoCaso;
import dao.DaoTecnico;
import entidades.Cliente;
import entidades.Especialidad;
import entidades.Estado;
import entidades.Incidente;
import entidades.IncidenteTecnico;
import entidades.Prioridad;
import entidades.Tecnico;
import entidades.Caso;

public class Main {

	public static void main(String[] args) {

		Tecnico usuario1 = new Tecnico();
		usuario1.setName("Juan");

DaoTecnico dao = new DaoTecnico();
dao.Add(usuario1);
}}
