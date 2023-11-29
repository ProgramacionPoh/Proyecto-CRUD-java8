package dao;

import java.util.List;

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
	    System.out.println(user.toString());
		ch.cerrarSession();
	}

	public Cliente ReadOne(int id)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
		session.beginTransaction();
		Cliente usuario=(Cliente)session.get(Cliente.class,id);
	     System.out.println(usuario.toString());
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
        System.out.println(cliente.toString());
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
	public List<Cliente> obtenerTodosLosClientes() {
	    ConfigHibernate config = new ConfigHibernate();
	    Session session = config.abrirConexion();

	    session.beginTransaction();

	    List<Cliente> clientes = (List<Cliente>) session.createQuery("FROM Cliente")
	            .list();

	    session.getTransaction().commit();
	    config.cerrarSession();

	    return clientes;
	}
}
