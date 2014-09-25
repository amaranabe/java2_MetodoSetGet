/*
 * Clase para obtener resultados del area y la circunferencia de un circulo.
 */
public class Circulo {

					static final double NUM_PI = 3.1416;
					private double radio = -1;

				//Metodo que calcula el area.
				 public double area () 
				 {

								double result;
								result	= NUM_PI * this.getRadio() * this.getRadio();
								return result;
				 }

				//Metodo que calcula la circunferencia.
				//Ha quitado public double area (double radio)
				 public double circunf () 
				 {

								double result;
								result = 2 *NUM_PI*this.getRadio();
								return result;
				 }

				 public double getRadio() 
				 {
								return radio;
				} 

					//que entra una variable set de tipo double y 
				 public void setRadio (double rad) 
				 {
								radio=rad;
				 } 

}

