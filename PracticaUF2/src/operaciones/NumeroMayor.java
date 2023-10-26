package operaciones;

public class NumeroMayor {

	/** Funcion del número mayor
	 * @param n1 Primer número flotante a comparar
	 * @param n2 Segundo número flotante a comparar
	 * @param n3 Tercer número flotante a comparar
	 * @return Devuelve el número flotante mayor de los 3 dados por el usuario
	 */
	public static float numMayor (float n1, float n2, float n3){
		if (n1 > n2) {
			if (n1 > n3) {
				return n1;
			}
			else {
				return n3;
			}
		}
		else {
			if (n2 > n3) {
				return n2;
			}
			else {
				return n3;
			}
		}	
	}
	
}
