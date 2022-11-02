//Maximum Of All Subarray Of Size K
import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{3,8,2,1,8,1,3,4};
		int k = 2;
		List<Integer> res = maxSubArray(arr,k);
		System.out.println(res.toString());
		
	}
	public static List<Integer> maxSubArray(int[] arr,int k)
	{
		//int max = Integer.MIN_VALUE;
		Queue<Integer> q = new LinkedList<Integer>();
		int i = 0 ;
		int j = 0;

		List<Integer> maxs = new ArrayList<Integer>();

		while(j<arr.length)
		{
			q.add(arr[j]);
			while(q.peek()<arr[j])
			{
				q.remove();
			}

			if(j-i+1 < k)
			{
				j++;
			}
			else if(j-i+1==k)
			{
				int max = q.peek();
				maxs.add(max);
				if(q.contains(arr[i]))
				{
					q.remove();
				}
				i++;
				j++;
			}
		}

		
		return maxs;
	}
}
