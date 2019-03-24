package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface comparar {
	public void compararTriple(List<Integer> a, List<Integer> b); 
}

public class CompareTriplets implements comparar{
	
	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		List<Integer> arregloUno = new ArrayList<>();
		List<Integer> arregloDos = new ArrayList<>();
		comparar comp = new CompareTriplets();
		
		for(int i = 0; i<3; i++) {
			arregloUno.add(entrada.nextInt());
		}
		
		for( int j = 0; j < 3; j++ ) {
			arregloDos.add(entrada.nextInt());
		}
		
		comp.compararTriple(arregloUno, arregloDos);
		
	}
	
	public void compararTriple( List<Integer> a, List<Integer> b ) {
		
		int alice = 0;
		int bob = 0;
		
		for(int i = 0; i < 3 ; i++) {
			
			if(a.get(i) > b.get(i)) {
				alice ++;
			}
			
			if(a.get(i) < b.get(i)) {
				bob ++;
			}
			
		}
		
		System.out.println(alice + " " + bob);
		
	}
	
}
