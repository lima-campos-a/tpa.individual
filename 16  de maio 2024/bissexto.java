import java.util.Scanner;
public class bissexto {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
        int an;
        System.out.println("Insira seu ano de nascimento");
        an= ler.nextInt();
        if (an % 4==0) {
        	System.out.println("O ano em que voc� nasceu � bissexto");
        } else {
        	System.out.println("O ano em que voc� nasceu n�o � Bissexto");
        }
        ler.close();
	}

}
