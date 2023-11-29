package dao;

import org.hibernate.Session;

import entidades.Operador;
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
	public Tecnico ReadOne(int id)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
		session.beginTransaction();
		Tecnico usuario=(Tecnico)session.get(Tecnico.class,id);
        
        config.cerrarSession();
        
        return usuario;
	}
	
	public void Tecnico(Tecnico tecnico)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.update(tecnico);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
	
	public void Delete(Tecnico tecnico)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.delete(tecnico);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
}
