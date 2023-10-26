import java.util.Scanner;
 
public class Start {
	//Este programa le pide al usuario un numero y comprueba si es primo o no.
 
	public static boolean calculoPrimo(int num) {
 
		//Esta función se encarga de calcular si el numero es primo o no
 
		int i = 0;
		int resto = 0;
 
		//Este rastrea los número que hay entre el número que da el usuario y el 1, sin incluirlos.
		if (num > 1) {
			for (i = num -1; i > 1; i--) {
				resto = num % i; //devuelve el resto de la división en cada vuelta del bucle.
				if (resto == 0) { //Si el resto da 0 en cualquier vuelta del bucle, devuelve False
					return false;
				}	
			}
		}	
		else {
			return false; //Si el numero es 1 o inferior devuelve False
		}	
	return true;	//Si no se cumple ninguna condicion dada anteriormente, es primo y devuelve true.
	}
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Declaración de variables
		int numero = 0;
		boolean esPrimo = false;
 
		System.out.println("***** Números primos *****");
		System.out.println("**************************");
		System.out.println();
		System.out.print("Introduzca un número: ");
		numero = sc.nextInt();
		//Se asigna a la variable de control de si es primo o no, el dato que devuelve la función
		esPrimo = calculoPrimo(numero);
 
		// Muestra el resultado
		if (esPrimo) { 
			System.out.println("El número SI es primo");
		}
		else {
			System.out.println("El número NO es primo");	
		}
	}
 
}