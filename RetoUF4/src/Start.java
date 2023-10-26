import Familia.Persona;
 
public class Start {
 
	public static void main(String[] args) {
		String [] nombre; // Para separar el nombre de los apellidos
		// Se crean 3 objetos persona
		Persona p1 = new Persona("Francisco Mancebo Santamaría", 29, "45346577T", "Varon", 89.0f, 1.81f, 3, "Calle Almerdros, 10", "Alicante", "Alicante");
		Persona p2 = new Persona("Alba Santamaría García", 56, "13458654A", "Mujer", 70.6f, 1.59f, 3, "Calle Olivos, 7", "Alicante", "Alicante");
		Persona p3 = new Persona("Jose Ramón Mancebo Domenech", 61, "23556576C", "Varon", 111.0f, 1.93f, 3, "Calle olivos, 7", "Alicante", "Alicante");
 
		// Se sacan los datos por consola
		p1.print();
		nombre = p1.getNombre().split(" ");
		System.out.println("El índice de masa corporal de " + nombre[0] + " es " + p1.imc());
 
		p2.print();
		nombre = p2.getNombre().split(" ");
		System.out.println("El índice de masa corporal de " + nombre[0] + " es " + p2.imc());
 
		p3.print();
		nombre = p3.getNombre().split(" ");
		System.out.println("El índice de masa corporal de " + nombre[0] + " " + nombre[1] + " es " + p3.imc());
 
	}
}