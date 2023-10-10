import java.util.Scanner;
import java.lang.Math;
public class EXAM6_1S21{
//Realizar un programa que calcule la distancia del punto (x0, y0)
	public static void main(String[] args) {
		java.util.Scanner teclado = new Scanner(System.in);
		int x;
		int y;
		int a;
		int b;
		int c;
		int abs;
		double distancia;
		double raizAB;
		System.out.println("calcular el valor de las distancia entre 2 puntos ");
		System.out.println("introdusca las cordenadas del punto X: ");
		x = teclado.nextInt();
		System.out.println("introdusca las cordenadas del punto Y: ");
		y = teclado.nextInt();
		System.out.println("introdusca el valor A: ");
		a = teclado.nextInt();
		System.out.println("introdusca el valor B: ");
		b = teclado.nextInt();
		System.out.println("introdusca el valor de C: ");
		c = teclado.nextInt();
		//operaciones
		//valor absoluto
		abs = Math.abs(a*x + b*y + c);
		//raiz de a+b
		raizAB = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
		// valor absoluto entre raiz a+b distancia = (abs*raizAB)/(raizAB*raizAB);
		System.out.println("el valor de la distancia es: " + resultado);
	}
}