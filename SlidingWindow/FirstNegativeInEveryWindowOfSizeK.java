//FirstNegativeInEveryWindowOfSizeK
//Maximum sum subarray of size k
import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{3,-2,2,-1,8,1,-3,4,5,6};
		int k = 3;
		List<Integer> res = firstNegative(arr,k);
		System.out.println(res.toString());
		
	}
	public static List<Integer> firstNegative(int[] arr,int k)
	{
		List<Integer> res = new ArrayList<Integer>();
		Queue<Integer> q = new LinkedList<Integer>();
		int i = 0;
		int j = 0;

		while(j < arr.length)
		{
			if(arr[j] < 0)
			{
				q.add(arr[j]);
			}
			if(j-i+1 < k)
			{
				j++;
			}
			else if(j-i+1 == k)
			{
				if(q.size() == 0)
				{
					res.add(0);
				}
				else
				{
					res.add(q.peek());
				}

				if(arr[i] < 0)
				{
					q.remove(arr[i]);
				}
				i++;
				j++;
			}
		}



		return res;
	}
}
