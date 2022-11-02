import java.util.*;
class demo2
{
	public static void main(String[] args) 
	{
	 int[] arr = new int[]{7,9,8,1,2,3};
	 //
	 System.out.println(Arrays.toString(arr));	
	 quicksort(arr,0,arr.length-1);
	 //---sorted array
	 System.out.println(Arrays.toString(arr));	
	}

	public static void quicksort(int[] arr,int low,int high)
	{
		if(low<high)
		{
			int pidx = partition(arr,low,high);
			quicksort(arr,low,pidx-1);
			quicksort(arr,pidx+1,high);
		}
	}

	public static int partition(int[] arr,int low,int high)
	{
		int pivot = arr[high];
		int i = low-1;
		//int j=low;

		
			for(int j = low ; j <high ; j++)
			{
				if(arr[j]<arr[high])
				{
				//swap i and j
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]=temp;
				}
			//swap i with pivot
			
			}
			i++;
			int temp = arr[i];
			arr[i]=arr[high];
			arr[high]=temp;
		
		return i;
	}
}