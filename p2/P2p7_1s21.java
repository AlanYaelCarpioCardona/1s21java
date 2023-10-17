import java.util.Scanner;

public class P2p7_1s21{
	public static void main(String[] args) {
		char opc;
		Scanner teclado = new Scanner(System.in);
        boolean estado = true;
		do{
	       System.out.println("menu de opciones");
       System.out.println("1.-suma"); 
       System.out.println("2.-resta"); 
       System.out.println("3.-multiplicacion"); 
       System.out.println("4.-division"); 
       System.out.println("S.-salida"); 
       System.out.println("s.-salida");
       System.out.println("¿que opcion deseas?"); 
      opc = teclado.nextLine().charAt(0);
      switch(opc){
      case '1' : System.out.println("haremos una suma"); break;
      case '2' : System.out.println("haremos una resta"); break;
      case '3' : System.out.println("haremos una multiplicacion"); break;
      case '4' : System.out.println("haremos una division"); break;
      case 'S' : 
      case 's' : 
      System.out.println("salimos"); 
         estado=false;
         break;
         }
  }while(estado);
}
}

		
	