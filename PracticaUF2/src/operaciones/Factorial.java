package operaciones;

public class Factorial {

	/** Funcion del factorial
	 * @param n Numero entero para sacar su factorial
	 * @return Devuelve el factorial del número dado por el usuario 
	 *         o -1 si el número que ha dado el usuario es menor a 1
	 */
	public static int factorial (int n){
		int i = 0;
		if (n < 1) {
			return -1;
		}
		for (i = n-1; i >= 1; i--) {
			n = n * i;
		}
		return n;
	}
	
}
