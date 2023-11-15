package Vehiculos;

public class VehiculoGasolina extends Vehiculo {
	
	//Atributos
	protected float contaminacion;
	protected int tamanyoDeposito;
	
	//Constructores
	public VehiculoGasolina () {
		super ();
		this.contaminacion = 0.0f;
		this.tamanyoDeposito = 0;
	}
	
	/**
	 * Constructor de vehículo de gasolina con sobrecarga de datos.
	 * @param m Marca del vehículo.
	 * @param pr Precio del vehículo.
	 * @param pe Peso del vehículo.
	 * @param c Color del vehículo.
	 * @param l Longitud del vehículo.
	 * @param conta Contaminación del vehiculo de gasolina.
	 * @param td Tamaño del deposito del vehiculo de gasolina.
	 */
	public VehiculoGasolina(String m, float pr, float pe, String c, float l, float conta, int td) {
		super (m, pr, pe, c, l);
		this.contaminacion = conta;
		this.tamanyoDeposito = td;
	}

	//Getters y setters
	public float getContaminacion() {
		return contaminacion;
	}

	public void setContaminacion(float contaminacion) {
		this.contaminacion = contaminacion;
	}

	public int getTamanyoDeposito() {
		return tamanyoDeposito;
	}

	public void setTamanyoDeposito(int tamanyoDeposito) {
		this.tamanyoDeposito = tamanyoDeposito;
	}
	
	//Metodos propios
	public String mostrarInfo() {
		return super.mostrarInfo() + " - " + this.contaminacion + "g/KM" + " - " + this.tamanyoDeposito + "l";
	}
}
	