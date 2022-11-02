import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{7,5,1,2,3};
		//bubble sort

		for(int i = 0 ; i < arr.length-1 ; i++)
		{
			for(int j = 0 ; j < arr.length-1-i ; j++)
			{
				if(arr[j]>arr[j+1])
				{
					//do swapping
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
		
	}
}