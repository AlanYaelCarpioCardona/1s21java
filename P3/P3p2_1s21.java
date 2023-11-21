import java.util.Scanner;
public class P3P2_1S21{
    static Scanner teclado = new Scanner(System.in);
    

    public static void suma(){
        System.out.println("Suma de dos numeros");
        System.out.println("Ingresa el primer numero");
        int a = teclado.nextInt();
        System.out.println("Ingresa el segundo valor");
        int b = teclado.nextInt();
        int c = a + b;
        System.out.println("El resultado de la suma es: " + c);
    }

    public static void resta(){
        System.out.println("Resta de dos numeros");
        System.out.println("Ingresa el primer numero");
        int a = teclado.nextInt();
        System.out.println("Ingresa el segundo valor");
        int b = teclado.nextInt();
        int c = a - b;
        System.out.println("El resultado de la resta es: " + c);
    }

    public static void multiplicacion(){
        System.out.println("Multiplicacion de dos numeros");
        System.out.println("Ingresa el primer numero");
        int a = teclado.nextInt();
        System.out.println("Ingresa el segundo valor");
        int b = teclado.nextInt();
        int c = a * b;
        System.out.println("El resultado de la multiplicacion es: " + c);
    }

    public static void division(){
        System.out.println("Division de dos numeros");
        System.out.println("Ingresa el primer numero");
        int a = teclado.nextInt();
        System.out.println("Ingresa el segundo valor");
        int b = teclado.nextInt();
        int c = a / b;
        System.out.println("El resultado de la division es: " + c);
    }

    public static void menu(){
        System.out.println("Operaciones Basicas");
        System.out.println("\n A) Suma");
        System.out.println("\n B) Resta");
        System.out.println("\n C) Multiplicacion");
        System.out.println("\n D) Division");
        System.out.println("\n Presiona [S] para salir");
        System.out.println("\n ¿que operacion deseas?");
    }

    public static void main(String[] args) {
        boolean estado = true; 
        String opc;
        do {
             menu();
            opc = teclado.nextLine();
            switch (opc) {
            case "a" : suma();break;
            case "b" : resta();break;
            case "c" : multiplicacion();break;
            case "d" : division();break;
            case "A" : suma();break;
            case "B" : resta();break;
            case "C" : multiplicacion();break;
            case "D" : division();break;
            case "S" : salir();break;
            case "s" : System.out.println("Has elegido la opcion de salir");
            estado = false;break;
                
            }
        }while (estado);