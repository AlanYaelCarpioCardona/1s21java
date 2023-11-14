import java.util.Scanner;
public class P3p1_1s21{
	static Scanner teclado = new Scanner(System.in);
public static void Suma(){
	System.out.println("suma de dos nummeros");
	System.out.println("ingrese el primer numero");
	int a = teclado.nextInt();
	System.out.println("ingrese el segundo numero");
	int b = teclado.nextInt();
	int c = a+b;
	System.out.println("la suma fue:" + c);
}
public static void Resta(){
	System.out.println("resta de dos nummeros");
	System.out.println("ingrese el primer numero");
	int a = teclado.nextInt();
	System.out.println("ingrese el segundo numero");
	int b = teclado.nextInt();
	int c = a-b;
	System.out.println("la resta fue:" +c);
}
public static void Multiplicacion(){
	System.out.println("multiplicacion de dos nummeros");
	System.out.println("ingrese el primer numero");
	int a = teclado.nextInt();
	System.out.println("ingrese el segundo numero");
	int b = teclado.nextInt();
	int c = a*b;
	System.out.println("la resta fue:" +c);
}
public static void Division(){
	System.out.println("division de dos nummeros");
	System.out.println("ingrese el primer numero");
	int a = teclado.nextInt();
	System.out.println("ingrese el segundo numero");
	int b = teclado.nextInt();
	int c = a/b;
	System.out.println("la resta fue:" +c);
  }
  public static void menu (){
System.out.println("operaciones basicas");
System.out.println("A) Suma");
System.out.println("B) Resta");
System.out.println("C) Multiplicacion");
System.out.println("D) Division");
System.out.println("S) Salir ");
System.out.println("¿Que operacion deseas? ");

  }

public static void main(String[] args){
  	menu ();
  	String opc = teclado.nextLine();
if (opc.equals("A")) Suma();
if (opc.equals("B")) Resta();
if (opc.equals("C")) Multiplicacion();
if (opc.equals("D")) Division();
if (opc.equals("S")) System.exit(0);
if (opc.equals("s")) System.exit(0);
  	  }
}


