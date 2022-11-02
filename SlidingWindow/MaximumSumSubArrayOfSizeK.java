//Maximum sum subarray of size k
import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{3,2,2,1,8,1,3,4};
		int k = 4;
		int res = maxSubArray(arr,k);
		System.out.println(res);
		
	}
	public static int maxSubArray(int[] arr,int k)
	{
		int max = Integer.MIN_VALUE;
		int i = 0;
		int j = 0;
		int sum = 0;

		while(j < arr.length)
		{
			sum = sum+arr[j];
			if(j-i+1 < k)
			{
				j++;
			}
			else if(j-i+1 == k)
			{
				max = Math.max(max,sum);
				sum = sum-arr[i];
				i++;
				j++;
			}
		}
		return max;
	}
}
