package javaLes9;
import java.util.Scanner;

public class soru1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gunTahmini();
	}

	static void gunTahmini() {
		Scanner input = new Scanner(System.in);
		System.out.println("Günün harfini giriniz.");
		String gun = input.next();
		
		
		switch(gun) {
			case "p": System.out.println("Pazar, Pazartesi, Persembe"); break;
			case "P": System.out.println("Pazar, Pazartesi, Persembe"); break;
			case "s": System.out.println("Salı"); break;
			case "S": System.out.println("Salı"); break;
			case "ç": System.out.println("Çarşamba"); break;
			case "Ç": System.out.println("Çarşamba"); break;
			case "c": System.out.println("Cuma, Cumartesi");break;
			case "C": System.out.println("Cuma, Cumartesi");break;
			default:System.out.println("Bu harfle başlayan gün yoktur.");
		}
		return ;
	}
}
