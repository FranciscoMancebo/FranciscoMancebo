import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class Start {
 
	public static void main(String[] args) {
 
		// Se definen las variables
		String lineaFichero = "";
		String nota = "";
		Float sumaNotas = 0.0f;
		float divisor = 0.0f;
		float resultado = 0.0f;
		FileReader fr = null;
		BufferedReader br = null;
 
		try {
			fr = new FileReader ("./notasPepe.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
		br = new BufferedReader (fr);
 
		// Bucle de lectura linea por linea hasta que no haya mas lineas
		try {
			while ((lineaFichero = br.readLine())!=null) { 
				// Toma el valor que hay despues del espacio en cada linea
				// y se lo asigna a nota
				nota = lineaFichero.substring(lineaFichero.indexOf(" "));
				// Suma el valor de nota convertido a float en cada vuelta
				sumaNotas = sumaNotas + Float.parseFloat(nota);
				// Suma 1 por cada nota sumada a sumaNotas para luego hallar la media
				divisor = divisor + 1.0f;	
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Realiza la operación e imprime el resultado.
		resultado = sumaNotas / divisor;
		System.out.println("La nota mediadel alumno es: " + resultado);
	}
 
}