

import java.util.Scanner;


public class Start {


	Scanner sc = null;

	
	public Start (){ 
		this.sc = new Scanner(System.in);
	}



	public static void main(String[] args) {
		
		 
		Start calculadoraTextual = new Start();

		while(true){
			int opcion = (int) calculadoraTextual.menu();

			switch(opcion){
				case 1:
					calculadoraTextual.opSuma();
					break;
				case 2:
					calculadoraTextual.opResta();
					break;
				case 3:
					calculadoraTextual.opmultiplicar();
				break;
				case 4:
					calculadoraTextual.opDividir();
					break;
				case 5:
					 calculadoraTextual.opMayorDeTres();
					break;
				case 6:
					calculadoraTextual.opcapicua(opcion);
				break;
					
				case 0:
					System.out.println("Bye ;)");
					System.exit(1);
				default:
					break;
			}
		}
		
	}

	public float menu() {
		
		System.out.println("Calculadora de Calculator S.A.");
		System.out.println("________________________________________\n");
		
		System.out.println("Introduzca una operación del menú: ");
		System.out.println("1.- Suma");
		System.out.println("2.- Resta");
		System.out.println("3.- Multiplicar");
		System.out.println("4.- Dividir");
		System.out.println("5.- Elija un número mayor de tres números");
		System.out.println("6.- Capicua");
		System.out.println("0.- Salir");

		return sc.nextInt();
	}



	// ------- Operación de Suma -------

	public void opSuma() {

		System.out.println("1.- suma");
		System.out.println("introduzca valor número uno");
		float x = sc.nextFloat();
		System.out.println("introduzca valor número dos");
		float y = sc.nextFloat();

		System.out.println("Resultado: " + suma(x,y));
	}

	public float suma(float x, float y) {
		return x +y;
	}




// ------- Operación de Resta -------	

	public void opResta() {

		System.out.println("2.- resta");
		System.out.println("introduzca valor número uno");
		float x = sc.nextFloat();
		System.out.println("introduzca valor número dos");
		float y = sc.nextFloat();

		System.out.println("Resultado: " + resta(x,y));
	}

	public float resta(float x, float y) {
		return x -y;
	}
	
	
	// ------- Operación de Multiplicar -------	

	public void opmultiplicar() {

		System.out.println("3.- multiplicar");
		System.out.println("introduzca valor número uno");
		float x = sc.nextInt();
		System.out.println("introduzca valor número dos");
		float y = sc.nextInt();

		System.out.println("Resultado: " + multiplicar(x,y));
	}

	public float multiplicar(float x, float y) {
		return x * y;
	}
	
	// ------- Operación de Dividir -------	

		public void opDividir() {

			System.out.println("4.- dividir");
			System.out.println("introduzca valor número uno");
			float x = sc.nextFloat();
			System.out.println("introduzca valor número dos");
			float y = sc.nextFloat();
			System.out.println("Resultado: " + Dividir(x,y));
		}

		public float Dividir(float x, float y) {
			return x / y;
		}
		
		

		// ------- Número mayor de tres números-------	

		public void opMayorDeTres() {

			System.out.println("5.- Elija un número mayor de tres números");
			System.out.println("introduzca valor número uno");
			int x = sc.nextInt();
			System.out.println("introduzca valor número dos");
			int y = sc.nextInt();
			System.out.println ("introduzca valor númeo tres");
			int z = sc.nextInt();
			


			if (x > y) {
	            if (x > z) {
	                System.out.println("El mayor es: " + x);                                             
	            } else {
	                System.out.println("el mayor es: " + z);     
	            }
	        } else if (y > z) {
	        	
	        
	            System.out.println("el mayor es: " + y);
	        } else {
	        	
	        }
	        	 System.out.println("el mayor es: " + z);
	        }
		
	          
	        
		
				
			
			 // ------- Capicua-------	

			public void opcapicua(int invertido) {

				int numero;
		        int numeroinvertido = 0;
		        int i= 0;
		    
		        String cadena, cadinv = "";

		        Scanner leer = new Scanner(System.in);

		        System.out.println("Ingresa un número:");
		        numero = leer.nextInt();

		        cadena = numero + "";

		        for (i = 0; i < cadena.length(); i++) {
		            cadinv = cadena.charAt(i) + cadinv;
		            {
		                numeroinvertido = numeroinvertido+ cadena.charAt(i);
		            }
		                
		            for (i=cadena.length()-1;i>0;i --) {
		            	
		            	System.out.println("número inverso: ");
		            
		            }
		           

		
		System.out.println ("Fin de las operaciones");
		
		        }
		        
			}
			
}
		            
		        
		
					   
					   
					   

			
		
		
	
					
				


			
	