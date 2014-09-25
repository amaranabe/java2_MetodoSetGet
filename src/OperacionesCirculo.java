import java.util.Scanner;

/*
 *Programa para conocer el area y la circunferencia de un circulo.
 */

public class OperacionesCirculo {

	public static void main (String args[]) {

		double radio;
		double result;
		//instruccion para reservar espacio en memoria para un objeto, instancia de clase de tipo circulo
		Circulo operaciones = new Circulo();
			
		Scanner sc = new Scanner(System.in);
		System.out.print("\n¿Cuál es el radio?: ");
		radio = sc.nextDouble();
		
		operaciones.setRadio(radio);
		
		result = operaciones.area();
		System.out.println("\nEl resultado del AREA es: " + result);
		
		result = operaciones.circunf();
		System.out.println("\nEl resultado de la CIRCUNFERENCIA es: " + result);
		
	
		System.out.println("\n\nEGUN ONA IZAN!!\n");
	}

}
