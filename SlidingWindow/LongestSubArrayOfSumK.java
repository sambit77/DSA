//Longest SubArray Of Sum K 
import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{3,8,2,1,8,1,3,4,3};
		int k = 11;
		int len = longestSubArray(arr,k);
		System.out.println(len);
		
	}
	public static int longestSubArray(int[] arr,int k)
	{
		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int sum = 0;

		int i = 0;
		int j = 0;

		while(j < arr.length)
		{
			
			//System.out.println("Loop is running fine");
			sum = sum+arr[j];
			//System.out.println("sum"+sum);
			if(sum<k)
			{
				j++;
			}
			else if(sum==k)
			{
				max = Math.max(max,(j-i+1));
				//System.out.println(max+"max");
				j++;
			}
			else if(sum > k)
			{
				while(sum>k)
				{
				sum=sum-arr[i];
				i++;
				//System.out.println(i);
				}
				j++;
				
			}
			
		}
		return max;
	}
}
