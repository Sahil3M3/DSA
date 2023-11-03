
public class SelectionSort {
	static public int selSort(int a[],int size)
	{
		int count=0;
		for(int j=0;j<size;j++)
		{
		for(int i=0;i<size;i++)
		{
			if(a[j]<a[i])
			{count++;
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			
			}
		}
		}
		return count;
	}//selSort()
	public static void main(String[] args) {
		int a[]= {44,11,55,22,66,33};
		for(int i=0;i<a.length;i++)
			System.out.print(" "+a[i]);
		int count =selSort(a,a.length);
		System.out.println("\n After sort ("+count +") no comparisions");
		for(int i=0;i<a.length;i++)
			System.out.print(" "+a[i]);

	}

}
