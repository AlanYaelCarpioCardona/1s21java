import java.util.Scanner;

public class EXAM9_1S21{
//Crear un programa que calcule la caída de potencial
	public static void main(String[] args) {
		java.util.Scanner teclado = new Scanner(System.in);
		int v,i,r;
		System.out.println("calcule la caida de pontencial producida por una resistencia segun la ley de ohm\n");
		System.out.println("escribir el valor de la intecidad");
		i = teclado.nextInt();
		System.out.println("escribir el valor de la resistencia: ");
		r = teclado.nextInt();

		if (r<=0 || r>1000) {
			System.out.println("el valor de la resistencia esta fuera de limites aceptables indicando");
		}
		else{
			v = i*r;
			System.out.println("el resultado de los voltios es:" + v);
		}
	}
}
		