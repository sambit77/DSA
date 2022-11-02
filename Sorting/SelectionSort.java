import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{7,5,2,3,1,4,5};
		//Bubble Sort
		for(int i = 0 ; i < arr.length ; i++)
		{
			int smallest = i;
			for(int j = i+1 ; j < arr.length ; j++)
			{
				if(arr[smallest] > arr[j])
				{
					smallest=j;
				}
			}
			//swap smallest and i
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest]=temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}