import java.util.Scanner;
import java.lang.Math;
public class EXAM3_1S21{
	//Escribir un programa que imprima el valor de volumen
		public static void main(String[] args) {
		java.util.Scanner teclado = new Scanner(System.in);
		double a;
		double b= 1.33;
		double resultado;
		System.out.println("calcular el volumen ");
		System.out.println("Escriba el radio: ");
		a = teclado.nextInt();
		resultado = b*Math.PI*Math.pow(a,3);
		//volumen es = (4/3)*PI*(r^3)
		System.out.println("El valor del volumen es: " + resultado);
	}
}