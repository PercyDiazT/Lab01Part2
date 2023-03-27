package Ejercicio2;
import java.util.ArrayList;
import java.util.Scanner;
public class Matriculados {
	static ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		int opc;
		do {
			System.out.println("Menu");
			System.out.println("1.Añadir estudiante");
			System.out.println("2.Buscar estudiante");
			System.out.println("3.Modificar estudiante");
			System.out.println("4.Borrar estudiante");
			System.out.println("5.Mostrar estudiantes");
			System.out.println("6.Salir");
			System.out.println("Elegir una opcion: ");
			opc = sc.nextInt();
			switch(opc) {
			case 1:
				agregarEstudiante();
				break;
			case 2:
				buscarEstudiante();
				break;
			case 3:
				modificarEstudiante();
				break;
			case 4:
				borrarEstudiante();
				break;
			case 5:
				mostrarEstudiantes();
				break;
			case 6:
				salir = true;
				break;
			default:
				System.out.println("Elige una opcion del 1-6");
			}
		}while(!salir);
		
	}
	public static void agregarEstudiante() {
		String nombres, apellidos;
		int dni, anioIngreso;
		//Ingreso de datos
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar");
		System.out.println("Nombres: ");
		nombres = sc.nextLine();
		System.out.println("Apellidos: ");
		apellidos = sc.nextLine();
		System.out.println("DNI: ");
		dni = sc.nextInt();
		System.out.println("Año de ingreso: ");
		anioIngreso = sc.nextInt();
		//Creacion del objeto del est
		Estudiante est = new Estudiante(nombres,apellidos,dni,anioIngreso);
		//Mediante el arrayList agregamos el estudiante
		listaEstudiantes.add(est);
	}
	public static void buscarEstudiante() {
		String nombre;
		Scanner sc = new Scanner(System.in);
		System.out.println("Contacto a buscar");
		System.out.println("Nombres: ");
		nombre = sc.nextLine();
		//Inicializamos la posicion en -1 para que en el caso no se encuentre 
		//en el ArrayList se envie un mensaje al usuario
		int pos = -1;
		//A traves del for recorremos todo el ArrayList
		//.size() nos indica cantidad de elementos que hay en el ArrayList 
		for(int i = 0; i < listaEstudiantes.size(); i++){
			//En el caso que se encuentre un objeto que coincida con el 
			//nombre que ingresamos, entrara en el if
            if(listaEstudiantes.get(i).getNombres().equalsIgnoreCase(nombre)) {
        		//hallamos la posicion mediante .indexOf
            	pos = listaEstudiantes.indexOf(listaEstudiantes.get(i));
            	System.out.println(listaEstudiantes.get(i));
            }	
        }
		if (pos !=-1) {
			System.out.println("El estudiante se en encuentra en la posicion: "+pos+1);
		}else {
			System.out.println("No se encontro el Contacto");
		}
	}
	public static void modificarEstudiante() {
		String nombre, nombreNuevo, apellidoNuevo;
		int dni, anioIngreso;
		Scanner sc = new Scanner(System.in);
		System.out.println("Contacto a modificar");
		System.out.println("Nombres: ");
		nombre = sc.nextLine();
		//Inicializamos la posicion en -1 para que en el caso no se encuentre 
		//en el ArrayList se envie un mensaje al usuario
		int pos=-1;
		//A traves del for recorremos todo el ArrayList
		//.size() nos indica cantidad de elementos que hay en el ArrayList
		for(int i = 0; i < listaEstudiantes.size(); i++){
			//En el caso que se encuentre un objeto que coincida con el 
			//nombre que ingresamos, entrara en el if
            if(listaEstudiantes.get(i).getNombres().equalsIgnoreCase(nombre)) {
        		//hallamos la posicion mediante .indexOf para poder hacer uso del .set
            	pos = listaEstudiantes.indexOf(listaEstudiantes.get(i));
            	System.out.println(listaEstudiantes.get(i));
            }	
        }
		//Si el contacto se encontro en el ArrayList, entrara al if
		if (pos !=-1) {
			//Ingreso de Datos
			System.out.println("Nombres: ");
			nombreNuevo = sc.nextLine();
			System.out.println("Apellidos: ");
			apellidoNuevo = sc.nextLine();
			System.out.println("DNI: ");
			dni = sc.nextInt();
			System.out.println("Año de ingreso: ");
			anioIngreso = sc.nextInt();
			//Creacion del objeto del estNuevo
			Estudiante estNuevo = new Estudiante(nombreNuevo,apellidoNuevo,dni,anioIngreso);
			listaEstudiantes.set(pos, estNuevo);
		}else {
			System.out.println("No se encontro el Contacto");
		}
		
	}
	public static void borrarEstudiante() {
		String nombre;
		Scanner sc = new Scanner(System.in);
		System.out.println("Estudiante a borrar");
		System.out.println("Nombre: ");
		nombre = sc.nextLine();
		//Inicializamos la posicion en -1 para que en el caso no se encuentre 
		//en el ArrayList se envie un mensaje al usuario
		int pos=-1;
		for(int i = 0; i < listaEstudiantes.size(); i++){
			//En el caso que se encuentre un objeto que coincida con el 
			//nombre que ingresamos, entrara en el if
            if(listaEstudiantes.get(i).getNombres().equalsIgnoreCase(nombre)) {
        		//hallamos la posicion mediante .indexOf para poder hacer uso del .remove
            	pos = listaEstudiantes.indexOf(listaEstudiantes.get(i));
            	System.out.println(listaEstudiantes.get(i));
            }	
        }
		if (pos !=-1) {
			//A traves del .remove quitamos al estudiante
			listaEstudiantes.remove(pos);
			System.out.println("Estudiante Borrado");
		}else {
			System.out.println("No se encontro en lista");
		}
	}

	public static void mostrarEstudiantes() {
		//A traves del .isEmpty revisamos que el ArrayList este lleno
		if (!listaEstudiantes.isEmpty()) {
			System.out.println("LISTA DE ESTUDIANTES");
			System.out.printf("%-20s\t%-20s\t%-8s\t%-30s\t%7s\n","NOMBRES","APELLIDOS","DNI",
					"CORREO","CODIGO");
			//A traves del for recorremos todo el ArrayList
			for(int i = 0; i < listaEstudiantes.size(); i++){
				String nombre,apellidos,correo;
				int dni,codigo;
				nombre = listaEstudiantes.get(i).getNombres();
				apellidos = listaEstudiantes.get(i).getApellidos();
				dni = listaEstudiantes.get(i).getDni();
				correo = listaEstudiantes.get(i).getCorreo();
				codigo = listaEstudiantes.get(i).getCodigo();
				//A traves de los gets obtenemos la informacion del contacto
				//Para su posterior impresion
				System.out.printf("%-20s\t%-20s\t%d\t%-30s\t%d\n",nombre,apellidos,dni,correo,codigo);
			}
		}else {
			System.out.println("No existen alumnos en lista");
		}
	}
}

