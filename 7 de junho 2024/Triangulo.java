import java.util.Scanner;
public class Triangulo {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
       int a, b, c;
       System.out.println("Insira a primeira medida do lado de seu tri�ngulo");
       a= ler.nextInt();
       System.out.println("Insira a segunda medida do lado de seu tri�ngulo");
       b= ler.nextInt();
       System.out.println("Insira a terceira medida do lado de seu tri�ngulo");
       c= ler.nextInt();
       if (a>b+c || b>a+c || c>b+a) {
    	   System.out.println("N�o se caracteriza como tri�ngulo");
       } else if (a==b && b==c) {
    	   System.out.println("Seu tri�ngulo � equil�tero");  
       } else if (a!=b && b!=c && a!=c) {
    	   System.out.println("Seu tri�ngulo � Escaleno");
       } else {
    	   System.out.println("Seu tri�ngulo � is�sceles");
       }
       ler.close();
	}

}
