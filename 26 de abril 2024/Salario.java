import java.util.Scanner;
public class Salario {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		double salario, dividas, resto;
		System.out.println("Insira seu sal�rio atual");
		salario= ler.nextDouble();
		System.out.println("Insira o valor das suas d�vidas");
		dividas= ler.nextDouble();
		resto= salario-dividas;
		if(resto<0) {
			System.out.println("Voc� ainda dever� R$"+resto);
		} else {
			System.out.println("Restam R$"+resto);
		}
		 ler.close();
	}
	
}
