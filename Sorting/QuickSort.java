//QuickSort
import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{3,2,1,7,4,9,8,5};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

		
	}
	public static void quickSort(int[] arr,int low,int high)
	{
		if(low<high)
		{
			int pidx = partition(arr,low,high);
			quickSort(arr,low,pidx-1);
			quickSort(arr,pidx+1,high);
		}
	}
	public static int partition(int[] arr,int low,int high)
	{
		int pivot = arr[high];
		int i = low-1;

		int j = low;
		while(j<high)
		{
			if(arr[j]<pivot)
			{
				i++;
				//swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]=temp;
			}
			//swap pivot
			j++;
			
		}
			i++;
			int temp = arr[i];
			arr[i]=arr[high];
			arr[high]=temp;
		return i;
	}
}