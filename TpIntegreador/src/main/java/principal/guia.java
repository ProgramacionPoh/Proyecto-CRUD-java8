/*
	1. Configuraci�n de la Sesi�n de Hibernate 

	Configuration configuration = new Configuration().configure();
	ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
	        configuration.getProperties()).buildServiceRegistry();
	SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

	    Explicaci�n: Aqu� configuras y creas la f�brica de sesiones de Hibernate, lo que permite la conexi�n con la base de datos.

	2. Instanciaci�n de Usuarios y Operaciones CRUD con Clientes

	

	//Cliente usuarioc1 = new Cliente()
	DaoCliente dao1 = new DaoCliente();
	dao1.Add(usuarioc1);

	    Explicaci�n: Creas una instancia de Cliente y DaoCliente para agregar el cliente a la base de datos.

	3. Operaciones CRUD con Otras Entidades (Especialidad, Operador, Incidente)



	Especialidad usuarioe1 = new Especialidad();
	DaoEspecialidad daoe1 = new DaoEspecialidad();
	daoe1.Add(usuarioe1);

	    Explicaci�n: Repites el proceso anterior para otras entidades como Especialidad, Operador, y Incidente.

	4. Contar T�cnicos por Especialidad


	Especialidad especialidadDeseada = especialidades.get(4);
	Integer tecnicosPorEspecialidad = daot5.contarTecnicosPorEspecialidad(especialidadDeseada);

	    Explicaci�n: Obtiene la especialidad deseada y utiliza un m�todo en DaoTecnico para contar la cantidad de t�cnicos para esa especialidad.

	5. Contar Clientes



	DaoCliente daoCliente = new DaoCliente();
	List<Cliente> clientes = daoCliente.obtenerTodosLosClientes();
	System.out.println("Cantidad de clientes en el sistema: " + clientes.size());

	    Explicaci�n: Utiliza DaoCliente para obtener la lista de todos los clientes y luego imprime la cantidad.

	6. Lectura, Modificaci�n y Eliminaci�n de Datos



	dao6.ReadOne(2);
	dao6.Cliente(usuarioc1);
	// dao6.Delete(usuarioc5);

	    Explicaci�n: Realiza operaciones de lectura, modificaci�n y (comentado) eliminaci�n de clientes utilizando m�todos en DaoCliente.
*/
