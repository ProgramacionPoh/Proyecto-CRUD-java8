package dao;

import org.hibernate.Session;

import entidades.Cliente;

public class DaoCliente {
	public void Add(Cliente user)
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		     
	    session.beginTransaction();
	    session.save(user);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}

}
