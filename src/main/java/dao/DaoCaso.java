package dao;

import org.hibernate.Session;

import entidades.Caso;

public class DaoCaso {

	public void Add(Caso user)
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		     
	    session.beginTransaction();
	    session.save(user);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}
}
