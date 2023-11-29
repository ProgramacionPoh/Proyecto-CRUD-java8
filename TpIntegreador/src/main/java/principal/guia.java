/*
	1. Configuración de la Sesión de Hibernate 

	Configuration configuration = new Configuration().configure();
	ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
	        configuration.getProperties()).buildServiceRegistry();
	SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

	    Explicación: Aquí configuras y creas la fábrica de sesiones de Hibernate, lo que permite la conexión con la base de datos.

	2. Instanciación de Usuarios y Operaciones CRUD con Clientes

	

	//Cliente usuarioc1 = new Cliente()
	DaoCliente dao1 = new DaoCliente();
	dao1.Add(usuarioc1);

	    Explicación: Creas una instancia de Cliente y DaoCliente para agregar el cliente a la base de datos.

	3. Operaciones CRUD con Otras Entidades (Especialidad, Operador, Incidente)



	Especialidad usuarioe1 = new Especialidad();
	DaoEspecialidad daoe1 = new DaoEspecialidad();
	daoe1.Add(usuarioe1);

	    Explicación: Repites el proceso anterior para otras entidades como Especialidad, Operador, y Incidente.

	4. Contar Técnicos por Especialidad


	Especialidad especialidadDeseada = especialidades.get(4);
	Integer tecnicosPorEspecialidad = daot5.contarTecnicosPorEspecialidad(especialidadDeseada);

	    Explicación: Obtiene la especialidad deseada y utiliza un método en DaoTecnico para contar la cantidad de técnicos para esa especialidad.

	5. Contar Clientes



	DaoCliente daoCliente = new DaoCliente();
	List<Cliente> clientes = daoCliente.obtenerTodosLosClientes();
	System.out.println("Cantidad de clientes en el sistema: " + clientes.size());

	    Explicación: Utiliza DaoCliente para obtener la lista de todos los clientes y luego imprime la cantidad.

	6. Lectura, Modificación y Eliminación de Datos



	dao6.ReadOne(2);
	dao6.Cliente(usuarioc1);
	// dao6.Delete(usuarioc5);

	    Explicación: Realiza operaciones de lectura, modificación y (comentado) eliminación de clientes utilizando métodos en DaoCliente.
*/
