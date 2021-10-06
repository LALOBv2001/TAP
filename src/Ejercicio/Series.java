package Ejercicio;
import java.util.Scanner;

public class Series {
	

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		// TODO Auto-generated method stub
		 int a=0, b=0 , c = 10, suma = 0;
	        System.out.println("Ingrese el primer valor:");
	        a=teclado.nextInt();
	        System.out.println("Ingrese el segundo valor:");
	        b=teclado.nextInt();
	        System.out.println("\n"+a);
	        System.out.println(b);
	        for (int i = 1; i <= c; i++) {
	            suma = a + b;
	            System.out.println(suma);
	            a = b;
	            b = suma;
	        }
teclado.close();
	       

	}

}
