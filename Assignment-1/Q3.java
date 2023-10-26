

import java.util.Scanner;

public class Q3 {
	
	static int binarySearch(int arr[], int size, int key) {
		int left = 0;
		int right = size - 1;
		int mid;

		while (left <= right) {
			mid = (left + right) / 2;
			if (key == arr[mid]) {
				return mid;
			} else if (key > arr[mid]) {
				right = mid - 1;
			} else if (key < arr[mid]) {
				left = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int key;
		int cnt;
		
		Scanner sc = new Scanner(System.in);
		int arr1[]= {77,66,55,44,33};
		System.out.print("enter the key to be searched:: ");
		key = sc.nextInt();

		cnt = binarySearch(arr1,arr1.length, key);
		
		if (cnt < 0)
			System.out.println("element is not found");
		else
			System.out.println("element at " + cnt + " index");

		sc.close();

	}

}