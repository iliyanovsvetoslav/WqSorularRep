package javaLes9;
import java.util.Scanner;

public class soru5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parkUcreti();
	}

	static void parkUcreti() {
		Scanner input = new Scanner(System.in);
		System.out.println("Aracınızın Türünü seçin.");
		
		System.out.println("1 - Otomobil ");
		System.out.println("2 - Kamyonet ");
		System.out.println("3 - Kamyon ");
		
		
		int aracTuru= input.nextInt();
		System.out.println("Lütfen kaç saat kalacağınızı yazın.");
		int parkSaat = input.nextInt();		
		
		
		switch(aracTuru) {
			
			case 1: System.out.println("Otomobil için saatlik ücret 5.0 TL Toplam:"+ 5*parkSaat+" TL" ); break;
			case 2: System.out.println("Kamyonet için saatlik ücret 7.5 TL Toplam:"+ 7.5*parkSaat+" TL" ); break;
			case 3: System.out.println("Kamyon için saatlik ücret 10.0 TL Toplam:"+ 10*parkSaat+"TL" ); break;
			
			default:System.out.println("Yanlış tür araç.");
		}
		return ;
	}
}