package dao;

import org.hibernate.Session;

import entidades.Incidente;

public class DaoIncidente {
	public void Add(Incidente user)
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		     
	    session.beginTransaction();
	    session.save(user);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}
}
