//MErge Sort
import java.util.*;
class Abc
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{2,4,1,3,7,5,9,6,8};
		divide(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

		
	}
	public static void divide(int[] arr,int si,int ei)
	{
		int mid = si+(ei-si)/2;
		if(si==ei)
		{
			return;
		}

		divide(arr,si,mid);
		divide(arr,mid+1,ei);
		conquer(arr,si,ei,mid);
	}
	public static void conquer(int[] arr,int si,int ei,int mid)
	{
		int[] merge = new int[ei-si+1];
		int idx1 = si;
		int idx2 = mid+1;
		int x = 0;

		while(idx1 <= mid && idx2 <= ei)
		{
			if(arr[idx1]<arr[idx2])
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

		for(int i = 0 , j = si; i < merge.length ; i++,j++)
		{
			arr[j]=merge[i];
		}
	}
}