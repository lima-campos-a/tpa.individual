import java.util.Scanner;
public class Eleicoes {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int anoEleicao, nasc, idade;
		System.out.println("Insira o ano das próximas eleições");
		anoEleicao= ler.nextInt();
		System.out.println("Insira o seu ano de nascimento");
		nasc= ler.nextInt();
		idade= anoEleicao-nasc;
		System.out.println("Sua idade no ano das eleições será:"+idade);
		if(idade<16) {
			System.out.println("Não poderá votar");
		} else {
			System.out.println("Poderá votar");
		}
       ler.close();
	}

}
