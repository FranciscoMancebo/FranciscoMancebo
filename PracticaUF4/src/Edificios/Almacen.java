package Edificios;

public class Almacen extends Edificio {
	//Constructores
	public Almacen(float an, float al, float pr, String fun, String tip) {
		super(an, al, pr, fun, tip);
	}
		
	//Metodos propios
	public String funcionalidadEdificio() {
		return "Guarda el producto para su posterior venta.";
	}
	public String mostrarInfo() {
		return super.mostrarInfo();
	}
}
