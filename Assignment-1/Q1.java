import java.util.Scanner;

public class Q1 {
	// linear search function
public static int linearSearch(int ar[],int size,int key)
{
	int count=0;
	
	for(int i=0;i<size;i++)
	{
		count++;
		if(ar[i]==key)
		{
			return count;
		}
			
	}
	return -1;
}
// binary search
public static int binarySearch(int ar[],int size,int key)
{
	int count =0,left=0,right=size-1,mid;
	
	while(left<=right)
	{
		count++;
		mid=(left+right)/2;
		if(key==ar[mid])
			return count;
		else if(key<ar[mid])
			right=mid-1;
		else
			left=mid+1;
			
	}
	return -1;
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
 int ar[]= {11, 22, 33, 44, 55, 66, 77, 88, 99};	
int count;
//Linear search
System.out.println("Enter the key ");
int key=sc.nextInt();
count = linearSearch(ar,ar.length,key);

if(count<0)
System.out.println("not Found");
else
	System.out.println("Found on "+ count +" no of comparisions in Linear search");

count =binarySearch(ar,ar.length,key);
if(count<0)
System.out.println("not Found");
else
	System.out.println("Found on "+ count +" no of comparisions in binary search");

	}

}
