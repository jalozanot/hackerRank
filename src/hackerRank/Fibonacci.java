package hackerRank;

public class Fibonacci {
	
	
	
	public static void main(String args[]) {
		
		long val1 = 0;
		long val2 = 1;
		long valAux = 0;
		
		
	for (int i = 0; i < 100; i++) {
		
		valAux = val1 + val2;
		val1 = val2;
		val2 = valAux;
		
		System.out.println(i + " --- " + valAux);
	
	}
		
		
		
	}
	
	
}
