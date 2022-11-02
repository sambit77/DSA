import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{3,1,2,5,7,4,6,9,8};
		int n = arr.length;
		//bubble sort

		/*
		for(int i = 0 ; i < n-1 ; i++)
		{
			for(int j = 0 ; j < n-1-i ; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}*/

		//selection sort

		/*int smallest = 0;
		for(int i = 0 ; i < n ; i++)
		{
			smallest = i;
			for(int j = i+1 ; j < n ; j++)
			{
				if(arr[j]<arr[smallest])
				{
					smallest=j;
				}
			}

			//swap smallest & i
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest]=temp;
		}*/

		//insertion sort

		
		for(int i = 0 ; i < n ; i++)
		{
			int current = arr[i];
			int j = i-1;

			while(j >= 0 && current < arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}

		System.out.println(Arrays.toString(arr));
		
	}
}