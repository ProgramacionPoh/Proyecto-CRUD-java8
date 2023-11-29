package dao;

import org.hibernate.Session;
import entidades.Prioridad;

public class DaoPrioridad {

	public void Add(Prioridad user)
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		     
	    session.beginTransaction();
	    session.save(user);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}
}
