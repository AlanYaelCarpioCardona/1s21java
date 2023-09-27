
import java.util.Scanner;

public class P11_1s21{ 
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String operacion;
		int num1;
		int num2;
		int resultado;
	    
		System.out.println("Que operacion desea: Suma, Resta, Division, Multiplicacion, Raiz cuadrada o potencia");
			operacion = teclado.nextLine();
	    
	    if(operacion.equals("suma")){
			System.out.println("Haremos una suma");
			System.out.println("Ingresa el primer numero:");
			operacion = teclado.nextLine();
			num1 = Integer.parseInt(operacion);
			System.out.println("Ingresa el segundo numero:");
			operacion = teclado.nextLine();
			num2 = Integer.parseInt(operacion);
			resultado = num1 + num2;
			System.out.println("El resultado de la suma es:" + resultado);
		}
		if(operacion.equals("resta")){
			System.out.println("Haremos una resta");
			System.out.println("Ingresa el primer numero:");
			operacion = teclado.nextLine();
			num1 = Integer.parseInt(operacion);
			System.out.println("Ingresa el segundo numero:");
			num2 = Integer.parseInt(operacion);
			resultado = num1 - num2;
			System.out.println("El resultado de la resta es:" + resultado);

		}
		if(operacion.equals("multiplicacion")){
			System.out.println("Haremos una multiplicacion");
			System.out.println("Ingresa el primer numero:");
			operacion = teclado.nextLine();
			num1 = Integer.parseInt(operacion);
			System.out.println("Ingresa el segundo numero:");
			num2 = Integer.parseInt(operacion);
			resultado = num1 * num2;
			System.out.println("El resultado de la multiplicacion es:" + resultado);
		    
		}
		if(operacion.equals("division")){
			System.out.println("Haremos una Division");
			System.out.println("Ingresa el primer numero:");
			operacion = teclado.nextLine();
			num1 = Integer.parseInt(operacion);
			System.out.println("Ingresa el segundo numero:");
			num2 = Integer.parseInt(operacion);
			resultado = num1 / num2;
			System.out.println("El resultado de la Division es:" + resultado);
		    
		}
if(operacion.equals("potencia")){
			System.out.println("Haremos una Potencia");
    int base; 
    int potencia;
    System.out.println("ingresa la base: ");
    base=teclado.nextInt();
    System.out.println("ingresa la potencia: ");
    potencia = teclado.nextInt();
			System.out.println("El resultado de la Potencia es:" + Math.pow(base, potencia));
    

		}
	 if(operacion.equals("raiz cuadrada")){
			System.out.println("Haremos una Raiz cuadrada");
			 Scanner input = new Scanner(System.in);
	     System.out.println("introduce el número:");
	     double numero = input.nextDouble();
	     double raiz = Math.sqrt(numero);
	     System.out.println("la raiz cuadrada es:"+ numero + "es" + raiz);
	     input.close();
   
		}
	}
}
			
		

			
