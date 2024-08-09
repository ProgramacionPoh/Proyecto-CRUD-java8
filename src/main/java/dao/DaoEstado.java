package dao;

import org.hibernate.Session;

import entidades.Estado;

public class DaoEstado {
	public void Add(Estado user)
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		     
	    session.beginTransaction();
	    session.save(user);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}
}
