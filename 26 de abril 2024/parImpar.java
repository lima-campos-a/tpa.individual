import java.util.Scanner;
public class parImpar {

	public static void main(String[] args) {
	Scanner ler= new Scanner (System.in);
    int n;
    System.out.println("Insira um n�mero inteiro");
    n= ler.nextInt();
    if(n % 2==0) {
    	System.out.println ("seu n�mero � par");
    } else {
    	System.out.println ("Seu n�mero � �mpar");
    	}
    ler.close();
	}

}
