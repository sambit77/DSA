import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String st =sc.nextLine();
		System.out.println(isUnique(st));
		
	}
	public static boolean isUnique(String st)
	{
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();

		for(int i = 0 ; i < st.length() ; i++)
		{
			char ch = st.charAt(i);
			if(map.containsKey(ch))
			{
				return false;
			}
			else
			{
				map.put(ch,1);
			}
		}
		return true;
	}
}