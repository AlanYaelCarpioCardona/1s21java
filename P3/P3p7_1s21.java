import java.util.Scanner;
public class  P3p7_1s21{
public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	System.out.println("ingrese el numero de repeticiones: ");
	int repeticiones = teclado.nextInt();

	for (int i = 1; i <= repeticiones; i++){
		System.out.println("ingrese el numero para elevar al cubo; ");
		int numero = teclado.nextInt();

		int resultado = alcubo(numero);
	System.out.println("el resultado de " + numero + " al cubo es: " + resultado);

	int resultadofactorial =dividirenfactorial(resultado);
	System.out.println("el resultado de la factorial es: " + resultadofactorial);
}

 teclado.close();

}
static int alcubo(int n){
	return n * n * n;
   }
   static int dividirenfactorial(int resultadofactorial){
   	int factorial = 1;
   	for (int i = 1;i <= resultadofactorial; i++){
   	factorial *= i;
   }
   return resultadofactorial / factorial +1;
   }
}

b
