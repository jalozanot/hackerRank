package hackerRank;

public class Palindrome {
	
	public static void main(String args[]) {
		
		String variable = "alla";
		char[] prueba = variable.toCharArray();
		int count = 0;
		int j = prueba.length -1;
		boolean p = false;
		
		if(variable.length() % 2 != 0) {
			count = (variable.length()-1)/2;
		}
		
		for(int i = 0 ; i < count; i++) {
			if(prueba[i] == prueba[j]) {
				p = true;
			}
			
		}
		
		if(p == true) {
			System.out.println("es palindrome");
		} else 
			System.out.println("no es palindrome");
		
		
	}
	
}
