package Edificios;


public abstract class Edificio {
	
	//Atributos
	protected float anchura;
	protected float altura;
	protected float profundidad;
	protected String funcionalidad;
	protected String tipo;
	
	// Constructores
	public Edificio() {
		this.anchura = 0.0f;
		this.altura = 0.0f;
		this.profundidad = 0.0f;
		this.funcionalidad = "";
		this.tipo = "";
	}
		
	/**
	 * Constructor de vehículo con sobrecarga de datos.
	 * @param an Anchua del edificio.
	 * @param al Altura del edificio.
	 * @param pr Profundidad del edificio.
	 * @param fun Funcionalidad del edificio.
	 * @param tip Tipo de edificio.
	 */
	public Edificio(float an, float al, float pr, String fun, String tip) {
		this.anchura = an;
		this.altura = al;
		this.profundidad = pr;
		this.funcionalidad = fun;
		this.tipo = tip;
	}

	//Getters y setters
	public float getAnchura() {
		return anchura;
	}
	public void setAnchura(float anchura) {
		this.anchura = anchura;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getProfundidad() {
		return profundidad;
	}
	public void setProfundidad(float profundidad) {
		this.profundidad = profundidad;
	}
	public String getFuncionalidad() {
		return funcionalidad;
	}
	public void setFuncionalidad(String funcionalidad) {
		this.funcionalidad = funcionalidad;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
		
	//Metodos propios
	/**
	 * Este metodo calcula el coste de pintar el edificio entero
	 * @param precioMetro Coste de pintar cada metro cuadrado
	 * @return Devuelve -1.0f si el valor costePintura es negativo y el resultado del calculo en el caso contrario
	 */
	public float costePintura(float precioMetro) {
		if (precioMetro < 0.0f) {
			return -1.0f;
		}
		return precioMetro * this.anchura * this.altura * this.profundidad;
	}
		
	/**
	 * Este metodo calcula el coste de pintar el edificio entero
	 * @param precioMetro Coste de pintar cada metro cuadrado
	 * @param lado Se le pasa el lado del que se desea calcular el precio
	 * @return Devuelve -1.0f si el valor costePintura es negativo o 
	 * no coincide la instrucción del lado a calcular y el resultado del calculo en el caso contrario
	 */
	public float costePintura(String lado, float precioMetro) {
		if (precioMetro >= 0.0f && lado.equals("ladoanchura")) {
			return precioMetro * this.anchura * this.altura;
		}
		else if (precioMetro >= 0.0f && lado.equals("ladoprofundidad")) {
			return precioMetro * this.altura * this.profundidad;
		}
		return -1.0f;	
	}
	

	public abstract String funcionalidadEdificio();
	
	public String mostrarInfo() {
		return this.anchura + "m" + " - " + this.altura + "m" + " - " + this.profundidad + "m"  + " - " + this.funcionalidad + " - " + this.tipo;
	}
	
}
