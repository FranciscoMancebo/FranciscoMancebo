package Productos;

public class Producto {
	
	//Atributos
	protected int id;
	protected String nombre;
	protected String tipo;
	protected float anchura;
	protected float profundidad;
	protected float altura;
	
	//Constructores
	public Producto() {
		this.id = 0;
		this.nombre = "";
		this.tipo = "";
		this.anchura = 0.0f;
		this.profundidad = 0.0f;
		this.altura = 0.0f;
	}
	/**
	 * Metodo constructor de prodúcto
	 * @param id Número identificación del producto
	 * @param n Nombre del producto
	 * @param t Tipo de producto
	 * @param an Anchura del producto
	 * @param pr Profundidad del producto
	 * @param al Altura del producto
	 */
	public Producto(int id, String n, String t, float an, float pr, float al) {
		this.id = id;
		this.nombre = n;
		this.tipo = t;
		this.anchura = an;
		this.profundidad = pr;
		this.altura = al;
	}
	
	//Getters y setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getAnchura() {
		return anchura;
	}
	public void setAnchura(float anchura) {
		this.anchura = anchura;
	}
	public float getProfundidad() {
		return profundidad;
	}
	public void setProfundidad(float profundidad) {
		this.profundidad = profundidad;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	//Metodos propios
	public String mostrarInfo() {
		return this.id + " - " + this.nombre + " - " + this.tipo  + " - " + this.anchura + "m" + " - " + this.profundidad + "m" + " - " + this.altura + "m";
	}
}
