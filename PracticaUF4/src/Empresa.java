
import Edificios.Edificio;
import Productos.Producto;
import Vehiculos.Vehiculo;

public class Empresa {
	//Atributos
	protected Vehiculo vehiculo1;
	protected Vehiculo vehiculo2;
	protected Edificio edificio1;
	protected Edificio edificio2;
	protected Edificio edificio3;
	protected Producto producto1;
	protected Producto producto2;
	protected Producto producto3;
	protected Producto producto4;	
	
	//Constructores
	public Empresa() {
		this.vehiculo1 = null;
		this.vehiculo2 = null;
		this.edificio1 = null;
		this.edificio2 = null;
		this.edificio3 = null;
		this.producto1 = null;
		this.producto2 = null;
		this.producto3 = null;
		this.producto4 = null;	
	}
	/**
	 * Constructor del objeto empresa
	 * @param v1 Objeto vehiculo1 perteneciente a empresa
	 * @param v2 Objeto vehiculo2 perteneciente a empresa
	 * @param e1 Objeto edificio1 perteneciente a empresa
	 * @param e2 Objeto edificio2 perteneciente a empresa
	 * @param e3 Objeto edificio3 perteneciente a empresa
	 * @param p1 Objeto producto1 perteneciente a empresa
	 * @param p2 Objeto producto2 perteneciente a empresa
	 * @param p3 Objeto producto3 perteneciente a empresa
	 * @param p4 Objeto producto4 perteneciente a empresa
	 */
	public Empresa(Vehiculo v1, Vehiculo v2, Edificio e1, Edificio e2, Edificio e3, Producto p1, Producto p2, Producto p3, Producto p4) {
		this.vehiculo1 = v1;
		this.vehiculo2 = v2;
		this.edificio1 = e1;
		this.edificio2 = e2;
		this.edificio3 = e3;
		this.producto1 = p1;
		this.producto2 = p2;
		this.producto3 = p3;
		this.producto4 = p4;	
	}
	
	//Getters y setters
	public Vehiculo getVehiculo1() {
		return vehiculo1;
	}
	public void setVehiculo1(Vehiculo vehiculo1) {
		this.vehiculo1 = vehiculo1;
	}
	public Vehiculo getVehiculo2() {
		return vehiculo2;
	}
	public void setVehiculo2(Vehiculo vehiculo2) {
		this.vehiculo2 = vehiculo2;
	}
	public Edificio getEdificio1() {
		return edificio1;
	}
	public void setEdificio1(Edificio edificio1) {
		this.edificio1 = edificio1;
	}
	public Edificio getEdificio2() {
		return edificio2;
	}
	public void setEdificio2(Edificio edificio2) {
		this.edificio2 = edificio2;
	}
	public Edificio getEdificio3() {
		return edificio3;
	}
	public void setEdificio3(Edificio edificio3) {
		this.edificio3 = edificio3;
	}
	public Producto getProducto1() {
		return producto1;
	}
	public void setProducto1(Producto producto1) {
		this.producto1 = producto1;
	}
	public Producto getProducto2() {
		return producto2;
	}
	public void setProducto2(Producto producto2) {
		this.producto2 = producto2;
	}
	public Producto getProducto3() {
		return producto3;
	}
	public void setProducto3(Producto producto3) {
		this.producto3 = producto3;
	}
	public Producto getProducto4() {
		return producto4;
	}
	public void setProducto4(Producto producto4) {
		this.producto4 = producto4;
	}
	
	//Metodos propios
	public String mostrarInfo() {
		return vehiculo1.mostrarInfo() + "\n" + vehiculo2.mostrarInfo() + "\n" + edificio1.mostrarInfo() + "\n" + 
		edificio2.mostrarInfo() + "\n" + edificio3.mostrarInfo() + "\n" + producto1.mostrarInfo() + "\n" + producto2.mostrarInfo()
		 + "\n" + producto3.mostrarInfo() + "\n" + producto4.mostrarInfo();
	}
}
