package hackerRank;

import java.util.Scanner;

public class prueba {
    
    private static void find(int[] one, int[] two) {
        
        int total = 0;
        boolean add = true;
        
        for(int i = 1; i <= 100; i++) {
          add = true;
            for(int j = 0; j < one.length; j++) {
                if(i % one[j] != 0){
                    add = false;
                    break;
                }
            }
            for(int k = 0; k < two.length; k++) {
                if(!add) break;
                if(two[k] % i != 0){
                    add = false;
                    break;
                }
            }
          if(add) total++;  
        }
       System.out.println(total); 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        find(a,b);
    }
}