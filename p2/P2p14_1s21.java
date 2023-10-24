import java.util.Scanner;

public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int[][]Ma,Mb,Mc;
	int fa,ca,fb,cb,f,c,r,h;
	System.out.println("Ingresa el numero de filas para la matriz A:");
	fa=teclado.nextint();
	System.out.println("Ingresa el numero de filas para la matriz A:");
	ca=teclado.nextint();
	System.out.println("Ingresa el numero de filas para la matriz B:");
	fb=teclado.nextint();
	Sytem.out.println("Ingresa el numero de filas para la matriz B:");
	cb=teclado.nextint();
if (ca == fb){
	Ma = int[fa][ca];
	Mb = int[fb][cb];
	Mc = int[fa][cb];
	for (f=0; f<fa; f++){
		for (c=0; c<ca; c++){
		System.out.println("ingresa el valor para Ma["+f+"]["+c+"]:");
		Ma[f][c]=teclado.nexrInt();
	}
}
for (f=0; f<fa; f++){
		for (c=0; c<ca; c++){
		System.out.println("ingresa el valor para Ma["+f+"]["+c+"]:");
		Mb[f][c]=teclado.nexrInt();
		}
	}
	for (f=0; f<fa; f++){
	for (c=0; c<cb; c++){
     for(h=0;h<fb;h++){
      	r=Ma[f][h]*Mb[c][h]
      }
      Mc[f][c]=r;
		}
	}
   }else{
   	System.out.println("No se puede realizar el proceso de multiplicacion");
}
}
