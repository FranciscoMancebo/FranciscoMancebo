package Edificios;

public class Fabrica extends Edificio {
	
	//Constructores
	public Fabrica(float an, float al, float pr, String fun, String tip) {
		super(an, al, pr, fun, tip);
	}
	
	//Metodos propios
	public String funcionalidadEdificio() {
		return "Fabricación de productos.";
	}
	public String mostrarInfo() {
		return super.mostrarInfo();
	}
}
