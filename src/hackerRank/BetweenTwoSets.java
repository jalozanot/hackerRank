package hackerRank;

import java.util.Scanner;

public class BetweenTwoSets {

	public static Scanner in = new Scanner(System.in);

	public static void main(String args[]) {

		int m = in.nextInt();
		int n = in.nextInt();

		int m_array[] = new int[m];
		int n_array[] = new int[n];

		for (int i = 0; i < m_array.length; i++) {
			m_array[i] = in.nextInt();
		}

		for (int j = 0; j < n_array.length; j++) {
			n_array[j] = in.nextInt();
		}

		System.out.println(getTotalX(m_array, n_array));

	}

	public static int getTotalX(int[] one, int[] two) {

		int total = 0;
		boolean flag = true;

		for (int i = 1; i <= 100; i++) {
			flag = true;
			for (int k = 0; k < one.length; k++) {
				if (i % one[k] != 0) {
					flag = false;
					break;
				}
			}

			for (int j = 0; j < two.length; j++) {

				if (!flag)
					break;
				if (two[j] % i != 0) {
					flag = false;
					break;
				}
			}
			System.out.println(flag);
			if (flag)
				total++;

		}

		return total;

	}

}
