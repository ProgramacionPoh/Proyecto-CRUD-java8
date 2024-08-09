package dao;

import org.hibernate.Session;
import entidades.IncidenteTecnico;

public class DaoIncidenteTecnico {

	public void Add(IncidenteTecnico user)
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		     
	    session.beginTransaction();
	    session.save(user);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}
}
