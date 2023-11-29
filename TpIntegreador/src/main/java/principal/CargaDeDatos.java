package principal;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dao.DaoCliente;
import dao.DaoEspecialidad;
import dao.DaoIncidente;
import dao.DaoOperador;
import dao.DaoTecnico;
import entidades.Cliente;
import entidades.Especialidad;
import entidades.Incidente;
import entidades.Operador;
import entidades.Tecnico;

public class CargaDeDatos {
	public static void cargarUsuarios() {
		//Instanciacion de usuarios para la carga de datos en la DB
				Cliente usuarioc1 = new Cliente(28427593,"CalleSiempreViva123","Springfield","murillo@hotmail.com","Shusho","Murillo","Municipio","20-44221553-4");
				Cliente usuarioc2 = new Cliente(1987263,"CalleSiempreViva1234","Springfield","muños@falso.com","Luchon","Muños","EmpresasCaiman","33-44221553-4");
				Cliente usuarioc3 = new Cliente(1234123,"LaRosada","BuenosAires","MarisaSegovia@outlook.com","Maria","Segovia","Particular","20-22228543-4");
				Cliente usuarioc4 = new Cliente(39812831,"MariaPerita","EntreRios","gorgori@gmail.com","Clancy","Gorgori","Policia","15-19251573-3");
				Cliente usuarioc5 = new Cliente(1313123123,"LasGlicinas","ConcepcionDelUruguay","gomez1234@hotmail.com","gaston","Gomez","Taller Manolito","21-28427593-3");
				
		//Usuario repetido para la posterior Deleteo,Updateo y lectura
				Cliente usuarioc6 = new Cliente(1313123123,"LasGlicinas","ConcepcionDelUruguay","gomez1234@hotmail.com","gaston","Gomez","Taller Manolito","21-28427593-3");
			
		//Instanciacion de especialidades para la carga de datos en la DB	
				Especialidad usuarioe1 = new Especialidad("Tecnico Electricista","Encargado de la parte de electricidad","Electricidad");
				Especialidad usuarioe2 = new Especialidad("Tecnico Electromecanico","Encargado de la parte de electricidad y mecanica","Electromecanica");
				Especialidad usuarioe3 = new Especialidad("Tecnico en desarrollo","Desarrollo de applicaciones","Programacion");
				Especialidad usuarioe4 = new Especialidad("Tecnico Programacion web","Programador web","Programacion");
				Especialidad usuarioe5 = new Especialidad("Ingeniero en Sistemas","Desarrollo web,appi,seguridad,redes","Sistemas");
				
				// Obtener la lista de todas las especialidades después de la carga
				List<Especialidad> especialidades = new ArrayList<Especialidad>();
				especialidades.add(usuarioe1);
				especialidades.add(usuarioe2);
				especialidades.add(usuarioe3);
				especialidades.add(usuarioe4);	
				especialidades.add(usuarioe5);
				
		//Instanciacion de operadores para la carga de datos en la DB		
				Operador operador1 = new Operador("Juan","Monzon","Juanito@gmail.com","3445339913");
				Operador operador2 = new Operador("Federico","Asemborn","fede1234@gmail.com","1133441568");
				Operador operador3 = new Operador("Maria","Alejo","Majo@gmail.com","11875436913");
				Operador operador4 = new Operador("Julieta","Gonzales","Juliso@gmail.com","34413396543");
				Operador operador5 = new Operador("Flor","Strugser","florcio@gmail.com","3442319913");
			
		//Instanciacion de incidentes para la carga de datos en la DB		
				Incidente incidente1 =new Incidente("Error en una appi",usuarioc1,usuarioe3,LocalDateTime.now(),null,0,operador3);
				Incidente incidente2 =new Incidente("Error en una web",usuarioc2,usuarioe4,LocalDateTime.now(),LocalDateTime.of(2024,11,3,0,0),1,operador3);
				Incidente incidente3 =new Incidente("Foco quemado",usuarioc3,usuarioe1,LocalDateTime.now(),LocalDateTime.of(2024,2,5,0,0),1,operador2);
				Incidente incidente4 =new Incidente("Error en una web",usuarioc4,usuarioe4,LocalDateTime.now(),null,0,operador3);
				Incidente incidente5 =new Incidente("Error en una appi",usuarioc5,usuarioe5,LocalDateTime.now(),LocalDateTime.of(2024,9,1,0,0),1,operador5);

		//Conversion de los incidentes con Set para posteriormente cargarlos y vincularlos con un tecnico	
				Set<Incidente>listaIncidentes = new HashSet<Incidente>();
				listaIncidentes.add(incidente1);
				Set<Incidente>listaIncidentes2 = new HashSet<Incidente>();
				listaIncidentes.add(incidente2);
				Set<Incidente>listaIncidentes3 = new HashSet<Incidente>();
				listaIncidentes.add(incidente3);
				Set<Incidente>listaIncidentes4 = new HashSet<Incidente>();
				listaIncidentes.add(incidente4);
				Set<Incidente>listaIncidentes5 = new HashSet<Incidente>();
				listaIncidentes.add(incidente5);
				
		//Instanciacion de tecnicos para la carga de datos en la DB		
				Tecnico usuariot1 = new Tecnico(28427593,"Lapampa332","SantaFe","gerar1231@gmail.es","Gerard","Garnier", usuarioe1,listaIncidentes,"38-28427593-4", 11697714);
				Tecnico usuariot2 = new Tecnico(22417493,"LasGlicinas22","Parana","joaquin887@gmail.com","Joaquin","Rocha",usuarioe5,listaIncidentes2,"37-22417493-4",344269771);
				Tecnico usuariot3 = new Tecnico(21447553,"SanMartin1332","Corrientes","aerolineasar@hotmail.com","Bourlot","Gustavo",usuarioe3,listaIncidentes3,"26-21447553-3",1169722134);
				Tecnico usuariot4 = new Tecnico(18427533,"Maracana998","Misiones","bahia@outlook.com","Cabildo","Alex",usuarioe5,listaIncidentes4,"33-18427533-2",11422714);
				Tecnico usuariot5 = new Tecnico(15422293,"Elretiro","BahiaBlanca","laia@hotmail.com","Morillo","Alexander",usuarioe5,listaIncidentes5,"22-15422293-3",11637543);
				
		//Carga de datos de Clientes a la DB	
				DaoCliente dao1 = new DaoCliente();
				DaoCliente dao2 = new DaoCliente();
				DaoCliente dao3= new DaoCliente();
				DaoCliente dao4 = new DaoCliente();
				DaoCliente dao5 = new DaoCliente();
				DaoCliente dao6 = new DaoCliente();
				DaoCliente daoCliente = new DaoCliente();
				dao1.Add(usuarioc1);
				dao2.Add(usuarioc2);
				dao3.Add(usuarioc3);
				dao4.Add(usuarioc4);
				dao5.Add(usuarioc5);
				dao6.Add(usuarioc6);
				System.out.println("Insertado con exito clientes\n --------");
				
		//Carga de datos de Especialidades a la DB	
				DaoEspecialidad daoe1 = new DaoEspecialidad();
				DaoEspecialidad daoe2 = new DaoEspecialidad();
				DaoEspecialidad daoe3 = new DaoEspecialidad();
				DaoEspecialidad daoe4 = new DaoEspecialidad();
				DaoEspecialidad daoe5 = new DaoEspecialidad();
				daoe1.Add(usuarioe1);
				daoe2.Add(usuarioe2);
				daoe3.Add(usuarioe3);
				daoe4.Add(usuarioe4);
				daoe5.Add(usuarioe5);
				System.out.println("Insertado con exito especialidades\n --------");
				
		//Carga de datos de Operadores a la DB			
				DaoOperador daop1 = new DaoOperador();
				DaoOperador daop2 = new DaoOperador();
				DaoOperador daop3 = new DaoOperador();
				DaoOperador daop4 = new DaoOperador();
				DaoOperador daop5 = new DaoOperador();
				daop1.Add(operador1);
				daop2.Add(operador2);
				daop3.Add(operador3);
				daop4.Add(operador4);
				daop5.Add(operador5);
				System.out.println("Insertado con exito operadores\n --------");
				
		//Carga de datos de Incidentes a la DB	
				DaoIncidente daoi1 = new DaoIncidente();
				DaoIncidente daoi2 = new DaoIncidente();
				DaoIncidente daoi3 = new DaoIncidente();
				DaoIncidente daoi4 = new DaoIncidente();
				DaoIncidente daoi5 = new DaoIncidente();
				daoi1.Add(incidente1);
				daoi2.Add(incidente2);
				daoi3.Add(incidente3);
				daoi4.Add(incidente4);
				daoi5.Add(incidente5);
				System.out.println("Insertado con exito incidentes\n --------");
				
		//Carga de datos de Tecnicos a la DB	
				DaoTecnico daot1 = new DaoTecnico();
				DaoTecnico daot2 = new DaoTecnico();
				DaoTecnico daot3 = new DaoTecnico();
				DaoTecnico daot4 = new DaoTecnico();
				DaoTecnico daot5 = new DaoTecnico();

				daot1.Add(usuariot1);
				daot2.Add(usuariot2);
				daot3.Add(usuariot3);
				daot4.Add(usuariot4);
				daot5.Add(usuariot5);
				System.out.println("Insertado con exito de tecnicos\n --------");

				
		//CRUD	
		//Lectura de Cliente
				dao6.ReadOne(2);
				System.out.println("Cliente Leido\n --------");
		//Cliente modificado ahora con los valores del cliente 1
				dao6.Cliente(usuarioc1);
				System.out.println("Cliente Modificado\n --------");


//				b. Cuántos técnicos corresponden a cierta especialidad.
						Especialidad especialidadDeseada = especialidades.get(4);
						Integer tecnicosPorEspecialidad = daot1.contarTecnicosPorEspecialidad(especialidadDeseada);		
		//-------------------------------------------------	 
						
						
		//3. Realizar las siguientes consultas:
						
		//Cuantos clientes forman parte del sistema.
				List<Cliente> clientes = daoCliente.obtenerTodosLosClientes();
				System.out.println("Cantidad de clientes en el sistema: " + clientes.size());
				
				
		//Borrado de Cliente 
					dao6.Delete(usuarioc5);
					System.out.println("Cliente borrado con exito\n --------");	
				
}
}