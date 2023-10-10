import java.util.Scanner;
class P13_1s21{
	public static void main(String[] args) {
Scanner teclado = new Scanner (System.in);
		byte n,i,a;
			int sucesion=0, factor;
			System.out.println("Ingrese el valor de n: ");
			n=teclado.nextByte();

			for(i=0;1<=n;i++){
				factor=1;
				if (1==0)  factor=1;
				else{
					for (a=i;a>0;a--){
 factor*=a;
			}
		}
sucesion += Math.pow(i,3)/factor;
	}
	System.out.println("la sucesion es " + sucesion);
}
}