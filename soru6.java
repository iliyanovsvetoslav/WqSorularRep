package javaLes9;
import java.util.Scanner;

public class soru6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		filmSecimi();
	}

	static void filmSecimi() {
		Scanner input = new Scanner(System.in);
		System.out.println("Film Kategorisi Seçin.");
		
		System.out.println("1 - Aksiyon ");
		System.out.println("2 - Komedi ");
		System.out.println("3 - Dram ");
		
		
		int aracTuru= input.nextInt();
		
		
		switch(aracTuru) {
			
			case 1: System.out.println("Matrix\nDie Hard\nMad Max" ); break;
			case 2: System.out.println("Superbad\nThe Hangover\nDumb and Dumber" ); break;
			case 3: System.out.println("The Shawsank Redemption\nForrest Gump\nThe Green Mile" ); break;
			
			default:System.out.println("Yanlış kategori");
		}
		return ;
	}
}