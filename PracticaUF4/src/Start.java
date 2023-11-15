import Edificios.Almacen;
import Edificios.Fabrica;
import Edificios.Oficina;
import Productos.Puerta;
import Productos.Silla;
import Vehiculos.VehiculoElectrico;
import Vehiculos.VehiculoGasoil;

public class Start {
	public static void main(String[] args) {
		//Se instancia el objeto empresa
		Empresa empresa1 = new Empresa();
		//Vehiculos de empresa
		VehiculoElectrico vElctrico = new VehiculoElectrico("Seat Altea", 20000.0f, 3000.0f, "Rojo", 3.0f, 4000);
		VehiculoGasoil vGasoil = new VehiculoGasoil("Renault Kadjar", 28000.0f, 4000.0f, "Azul", 3.5f);
		
		//Edificios de empresa
		Fabrica fabrica1 = new Fabrica(400.0f, 400.0f, 500.0f, "", "Fabrica");		
		Oficina oficina1 = new Oficina(600.0f, 400.0f, 700.0f, "", "Oficina");
		Almacen almacen1 = new Almacen(600.0f, 400.0f, 700.0f, "", "Almacén");
		
		//Productos de empresa
		Silla silla1 = new Silla(1, "Silla N20", "Silla", 1.0f, 0.5f, 0.5f);
		Silla silla2 = new Silla(2, "Silla M100", "Silla", 1.5f, 0.5f, 1.5f);
		Puerta puerta1 = new Puerta(3, "Puerta P9", "Puerta", 1.5f, 2.25f, 0.25f);
		Puerta puerta2 = new Puerta(4, "Puerta F50", "Puerta", 1.25f, 1.25f, 0.25f);
		
		//Se setea la funcionalidad de los edificios obteniendola del metodo abstracto de cada uno.
		fabrica1.setFuncionalidad(fabrica1.funcionalidadEdificio());
		oficina1.setFuncionalidad(oficina1.funcionalidadEdificio());
		almacen1.setFuncionalidad(almacen1.funcionalidadEdificio());
		
		//Asignacion de objetos a empresa
		empresa1.setVehiculo1(vElctrico);
		empresa1.setVehiculo2(vGasoil);
		
		empresa1.setEdificio1(fabrica1);
		empresa1.setEdificio2(oficina1);
		empresa1.setEdificio3(almacen1);
		
		empresa1.setProducto1(silla1);
		empresa1.setProducto2(silla2);
		empresa1.setProducto3(puerta1);
		empresa1.setProducto4(puerta2);
		
		//Mostrar información de la empresa
		System.out.println(empresa1.mostrarInfo());
		System.out.println("****************************************************");
		
		//Calculo de pintura edificio 1
		if (fabrica1.costePintura(30.0f) == -1.0f) {
			System.out.println("Error, se ha introducido un valor negativo del coste por metro.");
		}
		else {
			System.out.println("El coste de pintar la " + fabrica1.getTipo() + " ha sido " + fabrica1.costePintura(30.0f));
		}
		
		//Calculo de pintura edificio 2
		if (oficina1.costePintura(30.0f) == -1.0f) {
			System.out.println("Error, se ha introducido un valor negativo del coste por metro.");
		}
		else {
			System.out.println("El coste de pintar la " + oficina1.getTipo() + " ha sido " + oficina1.costePintura(30.0f));
		}
		
		//Calculo de pintura edificio 3
		if (almacen1.costePintura(30.0f) == -1.0f) {
			System.out.println("Error, se ha introducido un valor negativo del coste por metro.");
		}
		else {
			System.out.println("El coste de pintar el " + almacen1.getTipo() + " ha sido " + almacen1.costePintura(30.0f));
		}
	}
}
