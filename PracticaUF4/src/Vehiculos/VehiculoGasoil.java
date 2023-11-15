package Vehiculos;

public class VehiculoGasoil extends Vehiculo {
	
	//Constructores

	/**
	 * Constructor de vehículo de gasolina con sobrecarga de datos.
	 * @param m Marca del vehículo.
	 * @param pr Precio del vehículo.
	 * @param pe Peso del vehículo.
	 * @param c Color del vehículo.
	 * @param l Longitud del vehículo.
	 */
	public VehiculoGasoil(String m, float pr, float pe, String c, float l) {
		super (m, pr, pe, c, l);
	}
	
	//Metodos propios
		public String mostrarInfo() {
			return super.mostrarInfo();
		}
}
