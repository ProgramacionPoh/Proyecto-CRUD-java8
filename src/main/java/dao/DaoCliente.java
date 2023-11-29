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

	public Cliente ReadOne(int id)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
		session.beginTransaction();
		Cliente usuario=(Cliente)session.get(Cliente.class,id);
        
        config.cerrarSession();
        
        return usuario;
	}
	
	public void Cliente(Cliente cliente)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.update(cliente);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
	
	public void Delete(Cliente cliente)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.delete(cliente);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
}
