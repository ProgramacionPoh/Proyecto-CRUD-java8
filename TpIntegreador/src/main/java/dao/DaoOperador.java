package dao;

import org.hibernate.Session;

import entidades.Operador;

public class DaoOperador {
	public void Add(Operador user)
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		     
	    session.beginTransaction();
	    session.save(user);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}

}
