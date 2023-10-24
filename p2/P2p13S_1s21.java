import java.util.Scanner;
public class P2p13S_1s21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int f,c;
		System.out.println("ingresa el numero de filas");
		f = teclado.nextInt();
		System.out.println("ingresa el numero de columnas");
		c = teclado.nextInt();
		int[][] MA = new int [f][c];
		int[][] MB = new int [f][c];
		int[][] MC = new int [f][c];
		int ff,fc;
		for (ff=0; ff<f; ff++){
		for (fc=0; fc<c; fc++){
		System.out.println("ingrese el valor para la posision ["+ff+"]["+fc+"]");
		MA[ff][fc] = teclado.nextInt();
		 		}
             }
		 	for (ff=0; ff<f; ff++){
		 	for (fc=0; fc<c; fc++){
		 			System.out.println("ingrese valor para la posicion ["+ff+"]["+fc+"]");
		 			MB[ff][fc] = teclado.nextInt();
		 		}
		 	}
		 			for (ff=0; ff<f; ff++){
		 			for (fc=0; fc<c; fc++){
		 					MC[ff][fc] = MA[ff][fc] + MB[ff][fc];
		 				}
		 			}
		 			for (ff=0; ff<f; ff++){
		 			for (fc=0; fc<c; fc++){
		 					System.out.println("El resultado de la matriz en su posicion["+ff+"]["+fc+"]es:" +MC[ff][fc]);
		 				}
		 			 }
		 		 }
		 	 }
		 		

		 	

		 
	
