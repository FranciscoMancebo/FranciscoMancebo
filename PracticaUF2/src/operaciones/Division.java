package operaciones;

public class Division {

	/** Funcion de la división
	 * 
	 * @param n1 Dividendo flotante a dividir
	 * @param n2 Divisor flotante a dividir
	 * @return Devuelve el resultado de la operación 
	 * 			o -1 si el divisor es 0
	 */
	public static float division (float n1, float n2){
		float res = 0.0f;
		if (n2!=0) {
			return res;
		}
		else {
			res = n1 / n2;
			return -1.0f;
		}
	}
}
