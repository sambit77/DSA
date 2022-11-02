//CountOccurancesOfAnagram 
import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		String str = "aabaabaa";
		String ptr = "aaba";
		int res = countAnagramOccurance(str,ptr);
		System.out.println(res);
		
	}
	public static int countAnagramOccurance(String str,String ptr)
	{
		int k = ptr.length();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(char c : ptr.toCharArray())
		{
			if(map.containsKey(c))
			{
				int cnt = map.get(c);
				cnt++;
				map.put(c,cnt);
			}
			else
			{
				map.put(c,1);
			}
		}

		int count = map.size();
		int ans = 0;
		int i = 0 ; 
		int j = 0;

		while(j < str.length())
		{
			char ch = str.charAt(j);
			if(map.containsKey(ch))
			{
				int cnt = map.get(ch);
				cnt--;
				map.put(ch,cnt);
				if(cnt == 0)
				{
					count--;
				}
			}

			if(j-i+1 < k)
			{
				j++;
			}
			else if(j-i+1 == k)
			{
				if(count == 0)
				{countAnagramOccurance
					ans++;
				}

				char ch1 = str.charAt(i);
				if(map.containsKey(ch1))
				{
					int f = map.get(ch1);
					f++;
					map.put(ch1,f);
					if(f==1)
					{
						count++;
					}
				}
				i++;
				j++;
			}	
		}
		return ans;
	}
}
