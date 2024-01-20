package caso3Proyecto;

import java.util.Scanner;

public class ProgramaPrincipal {

	static Scanner leer = new Scanner(System.in);
	public static void main(String[] args) {

		double area = calcularArea(pedirAltura(),pedirBase());
		System.out.println("El area del triangulo es: " + area);
		
		double radio = pedirRadio();
		System.out.println("El area de la circunferencia con radio "+radio+" es "+areaCircunferencia(radio));
		System.out.println("El perímetro de la circunferencia con radio "+radio+" es "+perimetroCircunferencia(radio));
	}
	//Area triangulo
		public static double calcularArea(double altura, double base) {
			double area = (base / 2) * altura;
			return area;
		}
		
		public static double pedirAltura() {
			System.out.println("Introduce la altura:");
			double altura = leer.nextInt();
			boolean salir = false;
			while (!salir) {
				if (altura <= 0) {
					System.err.println("Error. La altura no puede ser menor o igual que 0. Vuelve a introducirla:");
					altura = leer.nextInt();
				}
				else {
					salir = true;
				}
			}
			return altura;
		}
		
		public static double pedirBase() {
			System.out.println("Introduce la base:");
			double base = leer.nextInt();
			boolean salir = false;
			while (!salir) {
				if (base <= 0) {
					System.err.println("Error. La base no puede ser menor o igual que 0. Vuelve a introducirla:");
					base = leer.nextInt();
				}
				else {
					salir = true;
				}
			}
			return base;
		}
		
		// CIRCUNFERENCIA 
		
		
		public static double pedirRadio() {
			double radio;
			do {
				System.out.println("Introduce el radio de la circunferencia->");
				radio = leer.nextDouble();
				if ( radio<=0)
					System.err.println("Error, no puede ser menor a 0");
			}while(radio<=0);
			return radio;
		}
		//Area de la circunferencia
		
			public static double areaCircunferencia(double radio) {
				return 3.14*radio*radio;
						
				
			}
			
		//Perimetro de la circunferencia
			public static double perimetroCircunferencia(double radio) {
				return 2*3.14*radio;
				
			}

}
