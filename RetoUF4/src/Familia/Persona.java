package Familia;
 
public class Persona extends Familia{
 
	// Declaración de atributos
	protected String nombre;
	protected int edad;
	protected String dni;
	protected String sexo;
	protected float peso;
	protected float altura;
 
	//Constructores
	public Persona() {
		super();
		this.nombre = "";
		this.edad = 0;
		this.dni = "";
		this.sexo = "";
		this.peso = 0.0f;
		this.altura = 0.0f;
	}
	public Persona (String n, int e, String dni, String s, float pes,float a,int nl, String d, String p, String pr) {
		super (nl, d, p, pr);
		this.nombre = n;
		this.edad = e;
		this.dni = dni;
		this.sexo = s;
		this.peso = pes;
		this.altura = a;
	}
 
	//Getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
 
	// Metodos propios
	public float imc() {
		return this.peso / (this.altura*this.altura);
	}
	public void print() {
		System.out.println("**********************************************");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad);
		System.out.println("DNI: " + this.dni);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Peso: " + this.peso);
		System.out.println("Altura: " + this.altura);
		System.out.println("Numero libro de familia: " + this.numLibro);
		System.out.println("Dirección: " + this.direccion);
		System.out.println("Población: " + this.poblacion);
		System.out.println("Provincia: " + this.provincia);
	}
}