
public class BubbleSort {
static public int bubbleSort(int a[],int size)
{
	int count=0;
	for(int j=0;j<size;j++)
	{
	for(int i=0;i<size-1;i++)
	{
		
		if(a[i]>a[i+1])
		{count++;
			int t=a[i];
			a[i]=a[i+1];
			a[i+1]=t;
		}
	}
	}
	return count;
}
	public static void main(String[] args) {
		int arr[] = {33, 22, 66, 55, 44, 11};
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
		
		int c=bubbleSort(arr,arr.length);
		System.out.println("\n After Sort ("+c+") no of comparsion");
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
		

	}

}
