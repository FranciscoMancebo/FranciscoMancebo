package Familia;
 
public abstract class Familia {
 
	//Declaración de atributos
	protected int numLibro;
	protected String direccion;
	protected String poblacion;
	protected String provincia;
 
	//Costructores
	public Familia () {
		this.numLibro = 0;
		this.direccion = "";
		this.poblacion = "";
		this.provincia = "";
	}
	public Familia (int nl, String d, String p, String pr) {
		this.numLibro = nl;
		this.direccion = d;
		this.poblacion = p;
		this.provincia = pr;
	}
 
	//Getters y setters
	public int getNumLibro() {
		return numLibro;
	}
	public void setNumLibro(int numLibro) {
		this.numLibro = numLibro;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
 
	//Metodos propios
	public abstract float imc ();
}