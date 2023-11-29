package dao;

import org.hibernate.Session;

import entidades.Especialidad;
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
	public Incidente ReadOne(int id)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
		session.beginTransaction();
		Incidente usuario=(Incidente)session.get(Incidente.class,id);
        
        config.cerrarSession();
        
        return usuario;
	}
	
	public void Incidente(Incidente incidente)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.update(incidente);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
	
	public void Delete(Incidente incidente)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.delete(incidente);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
}
