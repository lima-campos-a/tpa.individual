import java.util.Scanner;
public class Ordem {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int a, b, c;
		System.out.println("Insira um n�mero inteiro");
		a= ler.nextInt();
		System.out.println("Insira mais um n�mero inteiro");
		b= ler.nextInt();
		System.out.println("Insira outro n�mero inteiro");
		c= ler.nextInt();
		if (a<b && b<c) {
			System.out.println("Os N�meros em ordem crescente s�o:"+a);
			System.out.println(""+b);
			System.out.println(""+c);
		} else if (a<c && c<b) {
			System.out.println("Os N�meros em ordem crescente s�o:"+a);
			System.out.println(""+c);
			System.out.println(""+b);
		} else if (c<a && a<b) {
			System.out.println("Os N�meros em ordem crescente s�o:"+c);
			System.out.println(""+a);
			System.out.println(""+b);
		} else if (b<a && a<c) {
			System.out.println("Os N�meros em ordem crescente s�o:"+b);
			System.out.println(""+a);
			System.out.println(""+c);
		} else if (b<c && c<a) {
			System.out.println("Os N�meros em ordem crescente s�o:"+b);
			System.out.println(""+c);
			System.out.println(""+a);
		} else {
			System.out.println("Os N�meros em ordem crescente s�o:"+c);
			System.out.println(""+b);
			System.out.println(""+a);
		}
         ler.close(); 
	}

}
