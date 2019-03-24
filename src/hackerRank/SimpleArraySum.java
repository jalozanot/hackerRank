package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleArraySum implements ArraySuma{
	
	public static Scanner entrada = null;
	
	public static void main( String args[] ) {
		
		entrada = new Scanner(System.in);
		
		int tamArray = entrada.nextInt();
		int[] arreglo = new int[tamArray];
		
		for(int i = 0; i < tamArray; i++) {
			arreglo[i] = entrada.nextInt();
		}
		
		System.out.println(ArraySuma.SumarArray(arreglo));
		
	}
	
}

interface ArraySuma {
	
	public static int SumarArray (int[] array) {
		return Arrays.stream(array).sum();
	}
	
}
