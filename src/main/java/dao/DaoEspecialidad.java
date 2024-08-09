package dao;

import org.hibernate.Session;

import entidades.Especialidad;

public class DaoEspecialidad {
	public void Add(Especialidad user)
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		     
	    session.beginTransaction();
	    session.save(user);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}
}
