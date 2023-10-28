import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class Start {
 
	public static void main(String[] args) {
 
		// Se definen las variables
		String lineaFichero = "";
		String[] elementosLinea;
		String nota = "";
		float sumaNotas = 0.0f;
		int divisor = 0;
		float resultado = 0.0f;
		FileReader fr = null;
		BufferedReader br = null;
 
		try {
			fr = new FileReader ("./notasPepe.txt");
		} catch (FileNotFoundException e) {
			// Recoge la excepcion de que no encuentre el fichero, imprime el error y finaliza el programa.
			System.err.println("El fichero no existe.");
			return;
		}
 
		br = new BufferedReader (fr);
 
		// Bucle de lectura linea por linea hasta que no haya mas lineas
		try {
			while ((lineaFichero = br.readLine())!=null) { 
				/* Se utiliza el Split para dividir cada linea del fichero
				 * en 2 string diferentes que se almacenan en el array elementosLinea.
				 */
				elementosLinea = lineaFichero.split(" ");
				// Le asigno la segunda posicion (1) del array a nota, osea el String que hay detras del espacio.
				nota = elementosLinea [1];
				//Sumo la nota en cada vuelta.
				sumaNotas = sumaNotas + Float.parseFloat(nota);
				divisor++;
			}	
			fr.close();
			br.close();
		}
		catch (IOException e) {
			/* Al ser las excepciones del mismo tipo (IOException) las he juntado en un mismo catch
			 * que recoge las excepciones que puedan ocurrir en operaciones de input o output durante
			 * el bucle o el cierre de fr y br. Imprime el error y la traza por consola y finaliza el programa.
			 */
			System.err.println("Ha ocurrido algun error de entrada o salida");
			e.printStackTrace();
			return;
		}
		// Realiza la operación e imprime el resultado.
		resultado = sumaNotas / divisor;
		System.out.println("La nota mediadel alumno es: " + resultado);
	}
 
}