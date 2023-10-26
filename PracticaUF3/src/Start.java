import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Start {
	
	/**
	 * Esta función crea un fichero en la ruta especificada.
	 * @param url Ruta del fichero a crear
	 * @return Devuelve 0 si funciono correctamente y -1 si se dió algun error de excepción recogido por el catch
	 */
	public static int crearFichero (String url) {
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter (url);
			pw = new PrintWriter(fw);
			fw.close();
			pw.close();
			return 0;
		} catch (IOException e) {
			return -1;
		}
	}
	
	/**
	 * Esta función edita un fichero en la ruta especificada.
	 * @param url Ruta del fichero a editar
	 * @param t Texto que da el usuario para añadirlo al fichero
	 * @param tipo Determina si se quiere agregar texto al ya existente (true) o sobreescribirlo (false)
	 * @return Devuelve 0 si funciono correctamente y -1 si se dió algun error de excepción recogido por el catch
	 */
	public static int editarFichero (String url, String t, boolean tipo) {
		FileWriter fw = null;
		PrintWriter pw = null;	
		try {
			fw = new FileWriter (url, tipo);
			pw = new PrintWriter(fw);
			pw.println(t);
			fw.close();
			pw.close();
			return 0;
		} catch (IOException e) {
			return -1;
		}
	}
	
	/**
	 * Esta función elimina un fichero en la ruta especificada.
	 * @param url Ruta del fichero a eliminar
	 */
	public static void borrarFichero (String url) {
		File f = null;
		f = new File (url);
		f.delete();
	}
		
	/**
	 * Esta función crea una carpeta en la ruta especificada.
	 * @param url Ruta de la carpeta a crear
	 */
	public static void crearCarpeta (String url) {
		File f = null;
		f = new File (url);
		f.mkdir();
	}
	
	/**
	 * Esta función elimina una carpeta en la ruta especificada.
	 * @param url Ruta de la carpeta a eliminar
	 */
	public static void borrarCarpeta (String url) {
		File f = null;
		f = new File (url);
		f.delete();
	}
		
	public static void main(String[] args) {
		// Variables
		int seleccionMenu = 0;
		int i = 0;
		String ruta = "";
		String opcion = "";
		String texto = "";
		File fichero = null;
		File carpeta = null;
		boolean controlOpcion = false;
		String verde="\033[32m"; // Color verde para texto afirmativo
		String rojo="\033[31m"; // Color rojo para texto negativo
		String reset="\u001B[0m"; // Reset de color
		File [] listaFicheros;
		Scanner sc = new Scanner (System.in);
		
		// Imprime cabecera
		System.out.println("*************************************");
		System.out.println("****       EDITOR DE TEXTO       ****");
		System.out.println("*************************************");
		// Bucle del menú
		do {
			// Imprime menú
			System.out.println("Selecione una opción:");
			System.out.println("1) Crear un fichero");
			System.out.println("2) Editar un fichero");
			System.out.println("3) Borrar un fichero");
			System.out.println("4) Crear una carpeta");
			System.out.println("5) Borrar una carpeta");
			System.out.println("0) Salir");
			System.out.println();
			System.out.print("Opcion: ");
			try {
				seleccionMenu = sc.nextInt(); //Pide opción del menú al usuario
				sc.nextLine(); //Reset buffer del Scanner
			}
			catch (InputMismatchException e) {
				System.out.println(rojo + "------ Opción erronea, introduca una opción del menu. ------" + reset);
				seleccionMenu = -1; //Para no duplicar el mensaje de error cuando el usuario introduce una letra
				sc.next(); //Reset buffer del Scanner en caso de que el usuario introduzca una letra
			}
			System.out.println();

			switch (seleccionMenu) {
			
			//Salir
			case 0:
				System.out.print(verde + "------ Programa finalizado. -------" + reset);
				break;
				
			//Crear fichero	
			case 1:	
				System.out.print("Introduzca el nombre del nuevo fichero: ");
				ruta = sc.nextLine(); //Pide al usuario la ruta
				fichero = new File (ruta);
				if (!fichero.exists()) { // Si el archivo no existe
					if (crearFichero(ruta) != 0) { // Si actua el catch en la funcion no crea el fichero
						System.out.println(rojo + "------- La ruta no existe o no tiene permisos de escritura. ------" + reset);
						System.out.println();
					}
					else { // Si no actua el catch en la funcion crea el fichero
						System.out.println(verde + "------- El fichero se ha creado correctamente. ------" + reset);	
						System.out.println();
					}
				}
				else { // Si el fichero ya existe
					// Bucle de opción hasta que el usuarion meta opcion correcta
					do {
						System.out.print("Fichero existente ¿Desea sobrescribirlo (Si/s o No/n)? ");
						opcion = sc.nextLine(); //Pide al usuario la opción
						opcion = opcion.toLowerCase();
						if (opcion.equals("si") || opcion.equals("s")) { //Afirmativo
							if (crearFichero(ruta) != 0) { // Si actua el catch en la funcion no crea el fichero
								System.out.println(rojo + "------ El fichero no tiene permisos de escritura. ------" + reset);
								System.out.println();
							}
							else {
								System.out.println(verde + "------- El fichero se ha creado sobrescribiendo el ya existente. ------" + reset);	
								System.out.println();
							}
							controlOpcion = false; // Sale del bucle
						}
						else if (opcion.equals("no") || opcion.equals("n")) { //Negativo
							System.out.println(rojo + "------- El fichero NO se ha sobrescrito. --------" + reset);
							System.out.println();
							controlOpcion = false; // Sale del bucle
						}
						else { //Opcion no valida
							System.out.println(rojo + "------ Opcion erronea, inserte si (s) o no (n) ------" + reset);
							System.out.println();
							controlOpcion = true; // NO sale del bucle
						}
					}
					while (controlOpcion);
				}	
				break;
				
			//Editar fichero	
			case 2:
				System.out.print("Introduzca el nombre del fichero a editar: ");
				ruta = sc.nextLine(); //Pide al usuario la ruta
				fichero = new File(ruta);
				if (!fichero.exists()) { // Si el archivo no existe
					System.out.println(rojo + "------ Fichero inexistente ------" + reset);
					System.out.println();
				}
				else { // Si el archivo existe
					System.out.print("Introduzca el texto que desea añadir al fichero: ");
					texto = sc.nextLine(); // Pide el texto para editar en el fichero al usuario
					if (editarFichero(ruta, texto, true) != 0) { // Si actua el catch en la funcion, no se edita el fichero
						System.out.println(rojo + "------ El fichero no tiene permisos de escritura ------"+ reset);
						System.out.println();
					}
					else { // Si no actua el catch en la funcion, se edita el fichero
						System.out.println(verde + "------ Documento editado correctamente ------" + reset);
						System.out.println();
					}
				}
				break;
				
			//Borrar fichero
			case 3:
				System.out.print("Introduzca el nombre del fichero a borrar: ");
				ruta = sc.nextLine();
				fichero = new File(ruta);
				if (!fichero.exists()) { // Si el fichero no existe
					System.out.println(rojo + "------ Fichero inexistente ------" + reset);
					System.out.println();
				}
				else { // Si el fichero existe
					// Bucle de opción hasta que el usuarion meta opcion correcta
					do {
						System.out.print("¿Está seguro de que desea borrarlo (Si/s o No/n)? ");
						opcion = sc.nextLine(); //Pide al usuario la opción
						opcion = opcion.toLowerCase();
						if (opcion.equals("si") || opcion.equals("s")) { //Afirmativo
							borrarFichero(ruta); //Borra el fichero
							System.out.println(verde + "------ Fichero eliminado correctamente ------" + reset);
							System.out.println();
							controlOpcion = false; // Sale del bucle
						}
						else if (opcion.equals("no") || opcion.equals("n")) { //Negativo						
							System.out.println(rojo + "------ El fichero no se borró del sistema ------" + reset);
							System.out.println();
							controlOpcion = false; // Sale del bucle
						}
						else{ //Opcion erronea
							System.out.println(rojo + "------ Opcion erronea, inserte si (s) o no (n) ------" + reset);
							System.out.println();
							controlOpcion = true; // No sale del bucle
						}
					} 
					while (controlOpcion);
				}
				break;

			//Crear carpeta
			case 4:
				System.out.print("Introduzca el nombre de la carpeta a crear: ");
				ruta = sc.nextLine(); //Pide ruta al usuario
				carpeta = new File (ruta); 
				if (carpeta.exists()) { //Carpeta ya existe
					System.out.println(rojo + "------ Carpeta ya existente ------" + reset);
					System.out.println();
				}
				else { //Carpeta no existe
					crearCarpeta(ruta); // Crea la carpeta
					System.out.println(verde + "------ Carpeta creada correctamente ------" + reset);
					System.out.println();
				}	
				break;
				
			//Borrar carpeta
			case 5: 
				System.out.print("Introduzca el nombre de la carpeta a borrar: ");
				ruta = sc.nextLine(); //Pide ruta al usuario
				carpeta = new File (ruta); 
				listaFicheros = carpeta.listFiles(); //Array para listar ficheros y carpetas que contiene la ruta especificada
				if (listaFicheros.length == 0) { // Si no contiene ficheros
					if (!carpeta.exists()) { // Si no existe la carpeta
						System.out.println(rojo +"------ La carpeta no existe ------" + reset);
						System.out.println();
					}
					else { // Si existe la carpeta
						// Bucle de opción hasta que el usuarion meta opcion correcta
						do {
							System.out.print("¿Está seguro de que desea borrar la carpeta (Si/s o No/n)? ");
							opcion = sc.nextLine();
							opcion = opcion.toLowerCase();
							if (opcion.equals("si") || opcion.equals("s")) { //Afirmativo
								borrarCarpeta(ruta);
								System.out.println(verde + "------ Carpeta borrada correctamente ------" + reset);
								System.out.println();
								controlOpcion = false; //Sale del bucle
							}
							else if (opcion.equals("no") || opcion.equals("n")){ //Negativo
								System.out.println(rojo + "------ La carpeta no se borró del sistema ------" + reset);
								System.out.println();
								controlOpcion = false; // Sale del bucle
							}
							else{ // Opcion erronea
								System.out.println(rojo + "------ Opcion erronea, inserte si (s) o no (n) ------" + reset);
								System.out.println();
								controlOpcion = true; // No sale del bucle
							}
						}
						while (controlOpcion);
					}
				}
				else { //Si la carpeta contiene archivos o ficheros
					System.out.println(rojo + "------ La carpeta contiene los siguientes ficheros y no puede ser eliminada. ------" + reset);
					// Bucle para imprimir contenido de la carpeta
					for (i = 0; i < listaFicheros.length; i++) {
						System.out.println(rojo + listaFicheros[i] + reset);
					}
					System.out.println();
				}
				break;
			
			// El usuario introduce	una opcion erronea
			default:
				if (seleccionMenu!= -1) { //Si el usuario no ha introducido una letra pero si un numero incorrecto
					System.out.println(rojo + "------ Opción erronea, introduca una opción del menu. ------" + reset);
					System.out.println();
				}
				break;
			}
		}
		while (seleccionMenu != 0);
		sc.close();	
	}

}
