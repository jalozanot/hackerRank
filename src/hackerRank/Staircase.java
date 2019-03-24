package hackerRank;

import java.util.Scanner;

public class Staircase {
	
	public static Scanner in= new Scanner(System.in);
	
	public static void main(String  args[]) {
		
		int tamanio = in.nextInt();
		
		for(int i = 1; i<= tamanio; i++) {
			
			for(int j = 1; j <= tamanio; j++) {
				
				if( j <= (tamanio - i) ) {
					System.out.print(" ");
				} else
					System.out.print("*");
				
			}
			System.out.println();
		}
		
	}
	
}
