package hackerRank;

import java.util.Scanner;

public class DiagonalDifference {

  public static Scanner entrada = new Scanner(System.in);
  
  public static void main(String args[] ) {
	  
	  int tamanioArreglo = entrada.nextInt();
	  int Array[][] = new int[tamanioArreglo][tamanioArreglo];
	  int sumaDiagonalA = 0;
	  int sumaDiagonalb = 0;
	  int valAux = 0;
	  
	  for(int i = 0; i < tamanioArreglo; i++) {
		  for(int j = 0; j < tamanioArreglo; j++) {
			  
			  Array[i][j] = entrada.nextInt();
			  
		  }
	  
	  }
	  
	  
//	  for(int[] a : Array) {
//		  
//		  Arrays.stream(a).forEach(b -> System.out.print(b));
//		  System.out.println();
//		  
//	  }
	  valAux = tamanioArreglo - 1;
	  for(int i = 0; i < tamanioArreglo; i++) {
		  for(int j = 0; j < tamanioArreglo; j++) {
			  
			  if(i == j) {
				  sumaDiagonalA = sumaDiagonalA + Array[i][j];
			  }
			  
			  if(j ==  valAux) {
				  sumaDiagonalb = sumaDiagonalb + Array[i][j]; 
				  valAux--;
			  } 

			  
		  }
	  
	  }
	  
	  System.out.println(Math.abs(sumaDiagonalA-sumaDiagonalb));
	  
  }
  
}

