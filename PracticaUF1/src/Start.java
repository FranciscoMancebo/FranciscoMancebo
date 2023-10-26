
import java.util.Scanner;


public class Start {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// Declaración de variables
		int seleccionMenu = 0;
		float num1 = 0.0f;
		float num2 = 0.0f;
		float num3 = 0.0f;
		float resultado = 0.0f;
		String capicua1 = "";
		String capicua2 = "";
		int i = 0;
		
		// Cabecera del programa
		System.out.println("*********************************************");
		System.out.println("****    Calculadora de Calculator S.A    ****");
		System.out.println("*********************************************");
		System.out.println();
		
		//Se define el bucle del menu.
		do {
			
			//Se imprime el menú y pide la opción
			System.out.println("Introduzca una opcion del menú:");
			System.out.println("\t1.  Sumar");
			System.out.println("\t2.  Restar");
			System.out.println("\t3.  Multiplicar");
			System.out.println("\t4.  Dividir");
			System.out.println("\t5.  Nímero mayor de 3 números");
			System.out.println("\t6.  Capicúa");
			System.out.println("\t0.  Salir");
			System.out.println();
			System.out.print("Introduzca una opción: ");
			seleccionMenu = sc.nextInt();
			System.out.println();
			System.out.println();
			
			
			switch (seleccionMenu) {
			//Salir
			case 0:
				System.out.println();
				System.out.println("El programa ha finalizado.");
				break;
				
			//Suma
			case 1:
				System.out.print("Introduzca el primer número flotante a sumar: ");
				num1 = sc.nextFloat();
				System.out.print("Introduzca el segundo número flotante a sumar: ");
				num2 = sc.nextFloat();
				resultado = num1 + num2;
				System.out.print("La suma de " + num1 + " y " + num2 + " es " + resultado);
				break;
				
			//Resta
			case 2:
				System.out.print("Introduzca el primer número flotante a restar: ");
				num1 = sc.nextFloat();
				System.out.print("Introduzca el segundo número flotante a restar: ");
				num2 = sc.nextFloat();
				resultado = num1 - num2;
				System.out.print("La resta de " + num1 + " y " + num2 + " es " + resultado);
				break;
				
			//Multiplicación
			case 3:
				System.out.print("Introduzca el primer número flotante a multiplicar: ");
				num1 = sc.nextFloat();
				System.out.print("Introduzca el segundo número flotante a multiplicar: ");
				num2 = sc.nextFloat();
				resultado = num1 * num2;
				System.out.print("La multiplicación de " + num1 + " y " + num2 + " es " + resultado);
				break;
				
			//División
			case 4:
				System.out.print("Introduzca el primer número flotante a división: ");
				num1 = sc.nextFloat();
				System.out.print("Introduzca el segundo número flotante a división: ");
				num2 = sc.nextFloat();
				if (num2 != 0.0f) {
					resultado = num1 / num2;
					System.out.print("La división de " + num1 + " y " + num2 + " es " + resultado);
				}
				else {
					
				System.err.println("Error división por 0");
				}
				break;
				
			//	Número mayor de 3
			case 5:
				System.out.print("Introduzca el primer número flotante de los 3: ");
				num1 = sc.nextFloat();
				System.out.print("Introduzca el segundo número flotante de los 3: ");
				num2 = sc.nextFloat();
				System.out.print("Introduzca el tercer número flotante de los 3: ");
				num3 = sc.nextFloat();
				
				if (num1 > num2) {
					if (num1 > num3) {
						System.out.println("EL número " + num1 + " es el mayor de los 3 números");
					}
					else {
						System.out.println("EL número " + num3 + " es el mayor de los 3 números");
					}
				}
				else {
					if (num2 > num3) {
						System.out.println("EL número " + num2 + " es el mayor de los 3 números");
					}
					else {
						System.out.println("EL número " + num3 + " es el mayor de los 3 números");
					}
				}	
				break;
				
				//Capicúa
			case 6:
				System.out.print("Introduzca un número para saber si es capicúa: ");
				capicua1 = sc.next();
				//Bucle capicúa.
				for (i = capicua1.length() - 1; i >= 0; i--) {
					capicua2 = capicua2 + capicua1.charAt(i);
				}
				if (capicua1.equals(capicua2)) {
					System.out.println("SÍ es capicúa.");
					capicua2 = "";
				}
				else {
					System.out.println("NO es capicúa.");
					capicua2 = "";
				}
				break;
				
	
			default:
				System.out.println();
				System.err.println("Opción errónea.");
				System.out.println();
				break;
			}
			System.out.println();
			System.out.println();
		}
		
		//Se define la condición de funcionamiento de do while
		while (seleccionMenu != 0);
		
		sc.close();
		
	}
	
}
