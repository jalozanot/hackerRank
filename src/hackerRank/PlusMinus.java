package hackerRank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {
	
	public static Scanner in = new Scanner(System.in);
	public static int sumaNumPos;
    public static int sumaNumNeg;
    public static int sumaNumcero;
    
    public static void main(String args[] ) {
    	
    	int lengthArray = 0;
        int[] sumaArray = null;
        PlusMinus pm = new PlusMinus();
    	
        lengthArray = in.nextInt();
        sumaArray = new int[lengthArray];
        for(int i = 0; i < sumaArray.length; i++) {

            sumaArray[i] = in.nextInt();

        }
        
    }
    
    public void resultFraction(int[] array) {

        DecimalFormat df = new DecimalFormat("#.000000");

        double resultSumaPos = 0;
        float resultSumaNeg = 0f;
        float resultSumaCero = 0f;

        for (int a : array) {

            if(a > 0) {
                sumaNumPos ++;
            } else if(a < 0) {
                sumaNumNeg ++;
            } else if(a == 0) {
                sumaNumcero ++;
            }

        }

        resultSumaPos = (double)sumaNumPos / array.length;
        resultSumaNeg = (float)sumaNumNeg / array.length;
        resultSumaCero = (float)sumaNumcero / array.length;

        System.out.println(df.format(resultSumaPos));
        System.out.println(df.format(resultSumaNeg));
        System.out.println(df.format(resultSumaCero));
    }
	
}
