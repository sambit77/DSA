//Longest SubArray Of Sum K 
import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		String st = "aabacbebebe";
		int k = 3;
		int len = longestSubString(st,k);
		System.out.println(len);
		
	}
	public static int longestSubString(String st,int k)
	{
		int i = 0;
		int j = 0;
		int count = 0;
		int max = Integer.MIN_VALUE;
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		while(j<st.length())
		{
			char ch = st.charAt(j);
			if(map.containsKey(ch))
			{
				int cnt = map.get(ch);
				cnt++;
				map.put(ch,cnt);
			}
			else
			{
				map.put(ch,1);
				count++;
			}
			if(map.size() < k)
			{
				j++;
			}
			else if(map.size()==k)
			{
				max = Math.max(max,(j-i+1));
				j++;
			}
			else if(map.size()>k)
			{
				while(map.size()>k)
				{
					char ch2 = st.charAt(i);
					int cnt = map.get(ch2);
					cnt--;
					map.put(ch2,cnt);
					if(cnt==0)
					{
						map.remove(ch2);
					}
					i++;
				}

				j++;
			}
		}
		return max;
	}
}
