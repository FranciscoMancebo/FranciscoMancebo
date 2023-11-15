package Vehiculos;

public class VehiculoElectrico extends Vehiculo {
	
	//Atributos
	protected int potencia;
	
	//Constructores
	public VehiculoElectrico() {
		this.potencia = 0;
	}
	/**
	 * Constructor de vehículo con sobrecarga de datos.
	 * @param m Marca del vehículo.
	 * @param pr Precio del vehículo.
	 * @param pe Peso del vehículo.
	 * @param c Color del vehículo.
	 * @param l Longitud del vehículo.
	 * @param pot Potencia del vehículo electrico.
	 */
	public VehiculoElectrico(String m, float pr, float pe, String c, float l, int pot) {
		super (m, pr, pe, c, l);
		this.potencia = pot;
	}
	
	//Getter y setter
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	//Metodos propios
	public String mostrarInfo() {
		return super.mostrarInfo() + " - " + this.potencia + "KWh";
	}
}
