package ex.switch_case;
import java.util.Scanner;
public class programaFutebol {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int idade;
	System.out.println("insira a sua idade");
	idade = ler.nextInt();
	switch (idade) {
	case 6:
		System.out.println("Dente de leite");
	    break;
	case 7:
		System.out.println("J�nior");
	    break;
	case 8:
		System.out.println ("J�nior max");
		break;
	case 9:
		System.out.println ("J�nior master");
		break;
	case 10:
		System.out.println("Master");
		break;
		default:
			System.out.println("N�o permitido");
	
	}
	ler.close();
	

	}

}
