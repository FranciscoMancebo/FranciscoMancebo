package Edificios;

public class Oficina extends Edificio {
	//Constructores
	public Oficina(float an, float al, float pr, String fun, String tip) {
		super(an, al, pr, fun, tip);
	}
	
	//Metodos propios
	public String funcionalidadEdificio() {
		return "Creacion de etiquetas de los productos.";
	}
	public String mostrarInfo() {
		return super.mostrarInfo();
	}
}
