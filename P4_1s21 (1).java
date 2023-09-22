import java.util.Scanner;

class P4_1s21{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		String cadena1, cadena2 cadena3 cadena4;
		System.out.println("Ingresa tu nombre ");
		cadena1 = teclado.nextLine();
		System.out.println("Ingresa tu edad ");
		cadena2 = teclado.nextLine();
		System.out.println("Ingresa tu correo ");
		cadena3 = teclado.nextLine();
		System.out.println("Ingresa tu telefono ");
		cadena4 = teclado.nextLine();
		System.out.println("Bienvenido " + cadena1, tu edad es + cadena2, tu correo es + cadena3, tu telefono es + cadena4 ", a la clase");
	}
}