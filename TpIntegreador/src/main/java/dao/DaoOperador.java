package dao;

import org.hibernate.Session;

import entidades.Especialidad;
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
	public Operador ReadOne(int id)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
		session.beginTransaction();
		Operador usuario=(Operador)session.get(Operador.class,id);
        
        config.cerrarSession();
        
        return usuario;
	}
	
	public void Operador(Operador operador)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.update(operador);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
	
	public void Delete(Operador operador)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.delete(operador);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
}
