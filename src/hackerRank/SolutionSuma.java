package hackerRank;

import java.util.Scanner;

public class SolutionSuma implements suma{
	
	public static Scanner entrada = null;
	
	public static void main(String args[]) {
		
		suma implSuma = new SolutionSuma();
		
		entrada = new Scanner(System.in);
		int a = 0;
		int b = 0;
		a = entrada.nextInt();
		b = entrada.nextInt();
		
		System.out.println(implSuma.sumarNumero(a, b));
		
	}

	@Override
	public int sumarNumero(int a, int b) {
		return a+b;
	}
	
	
	
}

interface suma {
	public int sumarNumero(int a,int b);
}
