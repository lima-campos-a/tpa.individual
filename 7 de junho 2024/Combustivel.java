import java.util.Scanner;
public class Combustivel {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
        int km, litros;
        double gasto;
        System.out.println("Insira quantos km voc� rodou");
	    km= ler.nextInt();
	    System.out.println("Insira a capacidade m�xima em litros do seu tanque");
	    litros= ler.nextInt();
	    gasto= km/litros;
	    System.out.println("Seu gasto m�dio de combust�vel � "+ gasto);
	    if (gasto>10) {
	    	System.out.println("Seu carro � econ�mico");
	    } else {
	    	System.out.println("Seu carro n�o � econ�mico");
	    }
	    ler.close();
	}

}
