package ex.switch_case;
import java.util.Scanner;
public class programaSigno {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int dia, mes;
		System.out.println("insira o dia");
		dia = ler.nextInt(); 
		System.out.println("insira o m�s");
		mes = ler.nextInt(); 
		switch (mes) {
		case 1:
			if (dia<=20) {
			System.out.println("Capric�rnio"); 
			}
			else 
			System.out.println("Aqu�rio");
			break;
		case 2:
			if (dia<=19) {
			System.out.println("Aqu�rio"); }
			else
				System.out.println("Peixes");
			break;
		case 3:
			if (dia<=20) {
			System.out.println("peixes"); 
			}else 
				System.out.println("�ries"); 
			break;
		case 4:
			if (dia<=20) {
			System.out.println("�ries");
			}else 
				System.out.println("Touro");
			break;
		case 5:
			if (dia<=20) {
				System.out.println("Touro");
			}else
				System.out.println("g�meos");
			break;
		case 6:
			if (dia<=20) {
				System.out.println("g�meos");
			}else
				System.out.println("C�ncer");
			break;
		case 7:
			if (dia<=21) {
				System.out.println("C�ncer");
			}else
				System.out.println("Le�o");
			break;
		case 8:
			if (dia<=22) {
				System.out.println("le�o");
			}else
				System.out.println("Virgem");
			break;
		case 9:
			if (dia<=23) {
				System.out.println("Virgem");
			}else
				System.out.println("Libra");
			break;
		case 10:
			if (dia<=22) {
				System.out.println("Libra");
			}else
				System.out.println("Escorpi�o");
			break;
		case 11:
			if (dia<=21) {
				System.out.println("Escorpi�o");
			}else
				System.out.println("Sargit�rio");
			break;
		case 12:
			if (dia<=21) {
				System.out.println("Sargit�rio");
			}else
				System.out.println("Capric�rnio");
			break;
			default:
				System.out.println("M�s inv�lido");
					
			}
			
	ler.close();
			
		}
		
		
		}



