import java.util.Scanner;
public class Imc {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		double peso, altura, imc;
		System.out.println("Insira seu peso");
		peso= ler.nextDouble();
		System.out.println("Insira sua altura");
		altura= ler.nextDouble();
		imc= peso/(altura*altura);
		System.out.println("Seu imc � "+ imc);
		if (imc<18.5) {
			System.out.println("Excesso de magreza");
		} else if (imc<25) {
			System.out.println("Peso normal");
		} else if (imc<30) {
			System.out.println("Excesso de peso");
		} else if (imc<35) {
			System.out.println("Obesidade grau I");
		} else if (imc<40) {
			System.out.println("Obesidade grau II");
		} else {
			System.out.println("Obesidade grau III");
		}
       ler.close();
	}

}
