package javaLes9;
import java.util.Scanner;

public class soru4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		yemekFiyati();
	}

	static void yemekFiyati() {
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen yemeğinizi menüden seçiniz.");
		
		System.out.println("1 - Karışık Pizza ");
		System.out.println("2 - İskender ");
		System.out.println("3 - Hamburger ");
		System.out.println("4 - Noodle ");
		System.out.println("5 - Döner ");
		System.out.println("6 - Yaş Pasta ");
		
		int yemek = input.nextInt();
		
		
		
		
		switch(yemek) {
			
			case 1: System.out.println("Karışık pizza = 220 TL"); break;
			case 2: System.out.println("İskender = 200 TL"); break;
			case 3: System.out.println("Hamburger = 180 TL"); break;
			case 4: System.out.println("Noodle = 120 TL"); break;
			case 5: System.out.println("Döner = 150 TL"); break;
			case 6: System.out.println("Yaş Pasta = 200 TL"); break;
			
			
			default:System.out.println("Lütfen geçerli sayı giriniz.");
		}
		return ;
	}
}