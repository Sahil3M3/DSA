

public class Q5 {

	// find first non-repeating occurance of element in given array
	//static int search1stNonRepeatingOccurance(int arr[], int size) {

//		for (int i = 0; i < size; i++) {
//			int count=0;
//			for (int j = i + 1; j < size; j++) {
//				if (arr[i] == arr[j]) 
//					count++;
//				}
//				if(count==0)
//					return arr[i];
//
//			}
//		return -1;
//	}

	
	public static void main(String[] args) {

//		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
//
//		int cnt = search1stNonRepeatingOccurance(arr, arr.length);
//		System.out.println("1st non repeating occurance of number is " + cnt);

		
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<5;j++) {
				if(j==4)
					System.out.println("j="+j);
					break;
			}
			System.out.println("i="+i);
		}

	}

}