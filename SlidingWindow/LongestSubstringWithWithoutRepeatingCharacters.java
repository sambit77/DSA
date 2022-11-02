//LongestSubstringWithWithoutRepeatingCharacters
//Longest SubArray Of Sum K 
import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		String st = "pwwkew";
		int len = longestSubString(st);
		System.out.println(len);
		
	}
	public static int longestSubString(String st)
	{
		
		int max = Integer.MIN_VALUE;
		int i = 0;
		int j = 0;
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
			}
			if(map.size()==(j-i+1))
			{
				max=Math.max(max,(j-i+1));
				j++;
			}
			else if(map.size()<(j-i+1))
			{
				char ch2 = st.charAt(i);
				while(map.containsKey(ch2))
				{
					int cnt2 = map.get(ch2);
					cnt2--;
					map.put(ch2,cnt2);
					if(cnt2==0)
					{
						map.remove(ch2);
					}
				}
				i++;
				j++;
			}
		}
		return max;
	}
}

