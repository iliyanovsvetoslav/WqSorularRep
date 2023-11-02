package javaLes9;
import java.util.Scanner;

public class soru3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ayTahmini();
	}

	static void ayTahmini() {
		Scanner input = new Scanner(System.in);
		System.out.println("Kaçıncı ay olduğunu giriniz. Mevsim dönecektir.");
		int ay = input.nextInt();
		
		
		switch(ay) {
			case 12: 
			case 1: 
			case 2: System.out.println("Kış Mevsimi"); break;
			case 3: 
			case 4: 
			case 5: System.out.println("İlkbahar Mevsimi"); break;
			case 6: 
			case 7: 
			case 8: System.out.println("Yaz Mevsimi");break;
			case 9: 
			case 10: 
			case 11: System.out.println("Sonbahar Mevsimi");break;
			
			default:System.out.println("Bir yılda 12 ay vardır.");
		}
		return ;
	}
}