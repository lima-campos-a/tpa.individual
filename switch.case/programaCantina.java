package ex.switch_case;
import java.util.Scanner;
public class programaCantina {

	public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
    int codigo;
    System.out.println("insira o c�digo do produto");
    codigo = ler.nextInt();
    switch (codigo) {
    case 1:
    	System.out.println("Cachorro-quente, R$8,00");
        break;
    case 2:
    	System.out.println("Chesseburguer,R$12,00");
    	break;
    case 3:
    	System.out.println("X-salada,R$15,00");
        break;
    case 4:
    	System.out.println("Misto quente, R$11,00");
        break;
    case 5:
    	System.out.println("P�o na chapa, R$6,00");
        break;
        default:
        	System.out.println("C�digo inv�lido");
            
        
    }
    ler.close();
	}

}
