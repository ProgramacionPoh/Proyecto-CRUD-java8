package dao;

import org.hibernate.Session;

import entidades.Cliente;
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
	public Especialidad ReadOne(int id)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
		session.beginTransaction();
		Especialidad usuario=(Especialidad)session.get(Especialidad.class,id);
        
        config.cerrarSession();
        
        return usuario;
	}
	
	public void Especialidad(Especialidad especialidad)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.update(especialidad);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
	
	public void Delete(Especialidad especialidad)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.delete(especialidad);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
}
