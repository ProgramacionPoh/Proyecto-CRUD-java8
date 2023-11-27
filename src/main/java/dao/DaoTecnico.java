package dao;

import org.hibernate.Session;
import entidades.Tecnico;

public class DaoTecnico {

	public void Add(Tecnico user)
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		     
	    session.beginTransaction();
	    session.save(user);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}
}
