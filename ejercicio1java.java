package ejercicio1java;
import java.util.Scanner;

public class ejercicio1java {
	public static void main (String [] args) {
		  try (Scanner scan = new Scanner(System.in)) {
			String fecha;
			  String Nombre;
			  String direcci�n;
			  
			  int cantidad = 0;
			  String descripci�n1; 
			  int precio1 = 0;
			  
			  int cantidad2 = 0;
			  String descripci�n2;
			  int precio2 = 0;
			  
		      int total = cantidad * precio1;
		      int total2 = cantidad2 * precio2;
		      int subtotal = total + total2;
		      float IVA = (float) (  subtotal * 0.21);
		      int totalfinal = (int) (subtotal + IVA);
		      
			  
			  System.out.println ("Ingresar fecha");
			  fecha = scan.nextLine ();
			  System.out.println ("Ingresar nombre");
			  Nombre = scan.nextLine ();
			  System.out.println ("Ingresar direcci�n");
			  direcci�n = scan.nextLine ();
			  
			  System.out.println ("Ingrese cantidad");
			  cantidad = scan.nextInt();
			  scan.nextLine();
			  
			  System.out.println("Ingrese descripci�n");
			  descripci�n1 = scan.nextLine();
			  System.out.println("Ingresar precio");
			  precio1 = scan.nextInt();
			  
			  System.out.println("Ingrese cantidad");
			  cantidad2 = scan.nextInt();
			  scan.nextLine();
			  
			  System.out.println("Ingrese descripci�n");
			  descripci�n2 = scan.nextLine();
			  System.out.println("Ingrese precio");
			  precio2 = scan.nextInt();
			  
			 System.out.print("total:" + total);
			 System.out.print("total2:" + total2);			 
			 System.out.println("subtotal:"+ subtotal);			 
			 System.out.println("IVA:" +IVA);			 
			 System.out.println("Totalfinal:" + totalfinal);
	
			 
			 
			  

			  
			  
			  
		}
		  
		  
	} 
	

}
