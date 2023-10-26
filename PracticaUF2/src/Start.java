
import java.util.Scanner;
import operaciones.*;

public class Start {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// Declaración de variables
		int seleccionMenu = 0;
		float num1 = 0.0f;
		float num2 = 0.0f;
		float num3 = 0.0f;
		float resultado = 0.0f;
		int fact = 0;
		int resultadoF = 0;

		
		// Cabecera del programa
		System.out.println("*********************************************");
		System.out.println("****    Calculadora de Calculator S.A    ****");
		System.out.println("*********************************************");
		System.out.println();
		
		//Se define el bucle del menu.
		do {
			
			//Se imprime el menú y pide la opción
			System.out.println("Introduzca una opcion del menú:");
			System.out.println("\t1.  Funcion Sumar");
			System.out.println("\t2.  Funcion Restar");
			System.out.println("\t3.  Funcion Multiplicar");
			System.out.println("\t4.  Funcion Dividir");
			System.out.println("\t5.  Funcion Nímero mayor de 3 números");
			System.out.println("\t6.  Funcion Factorial");
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
				resultado = Suma.suma(num1,num2);
				System.out.print("La suma de " + num1 + " y " + num2 + " es " + resultado);
				break;
				
			//Resta
			case 2:
				System.out.print("Introduzca el primer número flotante a restar: ");
				num1 = sc.nextFloat();
				System.out.print("Introduzca el segundo número flotante a restar: ");
				num2 = sc.nextFloat();
				resultado = Resta.resta(num1,num2);
				System.out.print("La resta de " + num1 + " y " + num2 + " es " +  resultado);
				break;
				
			//Multiplicación
			case 3:
				System.out.print("Introduzca el primer número flotante a multiplicar: ");
				num1 = sc.nextFloat();
				System.out.print("Introduzca el segundo número flotante a multiplicar: ");
				num2 = sc.nextFloat();
				resultado = Multi.multiplicacion(num1,num2);
				System.out.print("La multiplicación de " + num1 + " y " + num2 + " es " +  resultado);
				break;
				
			//División
			case 4:
				System.out.print("Introduzca el primer número flotante a división: ");
				num1 = sc.nextFloat();
				System.out.print("Introduzca el segundo número flotante a división: ");
				num2 = sc.nextFloat();
				resultado = Division.division(num1,num2);
				if (resultado == -1.0f) {
					System.err.println("Error división por 0");
				}
				else {	
					System.out.print("La división de " + num1 + " y " + num2 + " es " +  resultado);
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
				resultado = NumeroMayor.numMayor(num1,num2,num3);
				System.out.println("EL número " + resultado + " es el mayor de los 3 números");
				break;
				
				//Factorial
			case 6:
				System.out.print("Introduzca un número para calcular el factorial: ");
				fact = sc.nextInt();
				resultadoF = Factorial.factorial(fact);
				
				if (resultadoF != -1) {
					System.out.println("El factorial de " + fact + " es " + resultadoF);
				}
				else {
					System.err.println("Error valor inferior a 0, introduzca un valor superior a 0.");
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
