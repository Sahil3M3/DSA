

import java.util.Scanner;

public class Q6 {

	static int findRank(int arr[], int size, int key) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (arr[i]<=key)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {

		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };

		System.out.print("enter the key u want to find rank: ");
		int key = new Scanner(System.in).nextInt();

		int rank = findRank(arr, arr.length, key);

		if (rank < 0)
			System.out.println("rank of " + key + " is : 0");
		else
			System.out.println("rank of " + key + " is : " + rank);
	}

}