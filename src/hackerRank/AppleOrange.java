package hackerRank;

import java.util.Scanner;

public class AppleOrange {
	
	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		
		int s = entrada.nextInt();
		int t = entrada.nextInt();
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int m = entrada.nextInt();
		int n = entrada.nextInt();
		int countA = 0;
		int countB = 0;
		
		
		int[] arrayA, arrayB, sumaArrayA, sumaArrayB;
		arrayA = new int[m];
		sumaArrayA = new int[m];
		arrayB = new int[n];
		sumaArrayB = new int[n];
		
		for(int i= 0; i < m; i++ ) {
			arrayA[i] = entrada.nextInt();
		}
		
		for(int u= 0; u < n; u++ ) {
			arrayB[u] = entrada.nextInt();
		}
		
		
		for (int i = 0; i < m; i++) {
			sumaArrayA[i] = a + arrayA[i]; 
			
			if(sumaArrayA[i] >=s  && sumaArrayA[i] <= t) {
				countA++;
			}
		
		}
		
		for (int j = 0; j < n; j++) {
			sumaArrayB[j] = b + arrayB[j]; 
			if(sumaArrayB[j] >= s  && sumaArrayB[j] <= t) {
				countB++;
				
			}
		}
		
		
		System.out.println(countA);
		System.out.println(countB );
		
		
	}
	
}
