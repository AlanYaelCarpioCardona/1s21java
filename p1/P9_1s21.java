import java.util.Scanner;
public class P9_1s21{
	public static  void main(String[] args){
	Scanner teclado = new Scanner(System.in);
	String operacion;
	System.out.println("Que tipo de operacion desea realizar");
	System.out.println("Escriba: Suma, Resta, Multiplicacion o division");
	operacion = teclado.nextLine();

	if (operacion.equals ("Suma")){
		System.out.println("Haremos una suma");
	}

	else if (operacion.equals("Resta")){
		System.out.println("Haremos una resta");
	}
		else if (operacion.equals("Multiplicacion")){
		System.out.println("Haremos una Multiplicacion");
	}
		else if (operacion.equals("Division")){
		System.out.println("Haremos una Division");
	} 
	else{
		System.out.println("No existe la operacion");
	}
}
}