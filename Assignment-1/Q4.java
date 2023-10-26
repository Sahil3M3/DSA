

import java.util.Scanner;

public class Q4 {
	
	static int searchNthOccurance(int arr[],int size,int key, int occ) {
		int occurance=0;
		for(int i=0;i<size;i++) {
			if(key==arr[i]) {
				occurance++;
				if(occurance==occ) {
					return i;
				}
			}
		}
		return -1;
	}
	
	public static void main(String args[]) {
		int cnt=0;
		
		//Scanner sc=new Scanner(System.in);
		
		int arr[]= {1,2,3,2,2,2,3};
		
		System.out.print("enter key u want to found: ");
		int key=new Scanner(System.in).nextInt();
		
		System.out.print("enter occurance u want to found: ");
		int occ=new Scanner(System.in).nextInt();
		
		cnt= searchNthOccurance( arr,arr.length,key,occ);
		
		if(cnt<0)
			System.out.println("occurance of "+key+" is not found");
		else
			System.out.println(+key+" is found at "+cnt+" index");
		
		
	}

}