package Vehiculos;


public class Vehiculo {

	// Atributos
	protected String marca;
	protected float precio;
	protected float peso;
	protected String color;
	protected float longitud;
	
	// Constructores
	public Vehiculo() {
		this.marca = "";
		this.precio = 0.0f;
		this.peso = 0.0f;
		this.color = "";
		this.longitud = 0.0f;
	}
	
	/**
	 * Constructor de vehículo con sobrecarga de datos.
	 * @param m Marca del vehículo.
	 * @param pr Precio del vehículo.
	 * @param pe Peso del vehículo.
	 * @param c Color del vehículo.
	 * @param l Longitud del vehículo.
	 */
	public Vehiculo(String m, float pr, float pe, String c, float l) {
		this.marca = m;
		this.precio = pr;
		this.peso = pe;
		this.color = c;
		this.longitud = l;
	}
	
	// Getters y setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getLongitud() {
		return longitud;
	}
	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}
	
	//Metodos propios
	public String mostrarInfo() {
		return this.marca + " - " + this.precio + "€" + " - " + this.peso + "Kg"  + " - " + this.color + " - " + this.longitud + "m";
	}
}
