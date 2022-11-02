import java.util.*;
class Ab
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{23,17,70,61,52};
		//insertion sort

		for(int i = 1 ; i < arr.length ; i++)
		{
			int current = arr[i];
			int j = i-1;
			while(j>=0 && current < arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;

		}

		//After sorting
		System.out.println(Arrays.toString(arr));
		
	}
	

}

