import java.util.*;
class demo
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{3,4,1,2,3,8,7,6,9};
		divide(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}
	public static void divide(int[] arr,int si,int ei)
	{
		if(si==ei)
		{
			return;
		}

		int mid = si+(ei-si)/2;

		divide(arr,si,mid);
		divide(arr,mid+1,ei);
		conquer(arr,si,ei,mid);
	}
	public static void conquer(int[] arr,int si,int ei,int mid)
	{
		int idx1 = si;
		int idx2 = mid+1;
		int x = 0;

		int[] merge = new int[ei-si+1];

		while(idx1<=mid && idx2 <= ei)
		{
			if(arr[idx1] < arr[idx2])
			{
				merge[x]=arr[idx1];
				x++;
				idx1++;
			}
			else
			{
				merge[x]=arr[idx2];
				x++;
				idx2++;
			}
		}

		while(idx1 <= mid)
		{
			merge[x]=arr[idx1];
			x++;
			idx1++;
		}
		while(idx2 <= ei)
		{
			merge[x]=arr[idx2];
			x++;
			idx2++;
		}

		//copy contents from merge array to main array
		for(int i = 0 , j = si ; i < merge.length ; i++ , j++)
		{
			arr[j]=merge[i];
		}
	}
}