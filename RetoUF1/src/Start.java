import java.util.Scanner;

public class Start {
	
	public static void main(String[] args) {
		
		/* Este programa le pide al usuario una hora completa con
		 * horas, minutos y segundos y comprueba si es correcta. 
		 */
		
		Scanner peticionDatos = new Scanner(System.in);
		
		int hora = 0;
		int minuto = 0;
		int segundo = 0;
		
		// Peticion de datos al usuario.
		System.out.print("Introduce la hora: ");
		hora = peticionDatos.nextInt();
		System.out.print("Introduce el minuto: ");
		minuto = peticionDatos.nextInt();
		System.out.print("Introduce el segundo: ");
		segundo = peticionDatos.nextInt();
		
		peticionDatos.close();
		
		// Comprobacion de datos introducidos y muestra resultado.
		if (hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59 && segundo >= 0 && segundo <= 59) {
			System.out.print("La hora es correcta.");
		}
		else {
			System.out.print("La hora NO es correcta.");
		}
	}

}
