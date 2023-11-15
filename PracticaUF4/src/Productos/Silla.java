package Productos;

public class Silla extends Producto {
	//Constructor
	public Silla(int id, String n, String t, float an, float pr, float al) {
		super(id, n, t, an, pr, al);
	}
	
	//Metodo propio
	public String mostrarInfo() {
		return super.mostrarInfo();
	}
}
