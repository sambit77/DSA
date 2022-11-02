import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();

		System.out.println(checkPermutation(s,t));
		
	}
	public static boolean checkPermutation(String s,String t)
	{
		if(s.length() != t.length())
		{
			return false;
		}
		int[] flag = new int[128];

		for(int i = 0 ; i < s.length() ; i++)
		{
			int ch = (int) s.charAt(i);
			flag[ch]++;
		}

		for(int j = 0 ; j < t.length() ; j++)
		{
			int ch = (int) t.charAt(j);
			//System.out.print(ch+" ");
			flag[ch]--;

			if(flag[ch] < 0)
			{
				return false;
			}
		}
		return true;


	}
	

}