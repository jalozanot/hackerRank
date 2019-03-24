package hackerRank;

public class Canguro {
	
	public static void main(String args[]) {
		System.out.println(Canguro.kangaroo(0, 3, 4, 2));
		
	}
	
	static String kangaroo(int x1, int v1, int x2, int v2) {
		
		int countCanguroA = x1;
		int countCanguroB = x2;
		int countSaltoA = 1;
		int countSaltoB = 1;
		
		for (int i = 0; i < 10; i++) {
			
			countCanguroA = countCanguroA + v1;
			countSaltoA++;
		
			countCanguroB = countCanguroB + v2;
			countSaltoB++;
		
			if(countCanguroA == countCanguroB && countSaltoB == countSaltoA) {
				System.out.println(countCanguroA + " " + countCanguroB + " " + countSaltoA + " " + countSaltoB);
				return "yes";
			}
			
		}
		
		return "no";
		
    }
	
}
