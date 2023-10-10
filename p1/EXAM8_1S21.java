import java.util.Scanner;
import java.lang.Math;
public class EXAM8_1S21{
// Escribir un programa que pida un número del 1 al 9
	public static void main(String[] args) {
		java.util.Scanner teclado = new Scanner(System.in);
		int i,num;
		System.out.println("tabla de multiplicar");
		System.out.println("escribir un numero del 1 al 9: ");
		num = teclado.nextInt();
		 for (i=1;i<=10;i++);{
		 	System.out.println(num +"x"+i+"="+(num*i));
		 }
	}
}