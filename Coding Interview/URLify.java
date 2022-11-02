import java.util.*;
class A
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();

		System.out.println(urlify(st));
		
	}
	public static String urlify(String st)
	{
		int truelength = st.length();

		int totalSpace = 0;

		for(int i = 0 ; i < st.length() ; i++)
		{
			char ch = st.charAt(i);
			if(ch == ' ')
			{
				totalSpace++;
			}
		}

		int lenReq =  truelength + totalSpace * 2;

		char[] wa = new char[lenReq];
		char[] crr = st.toCharArray();
		
		for(int i = 0 ; i < crr.length; i++)
		{
			wa[i] = crr[i];
		}
		int index = wa.length;
		for(int i = truelength - 1 ; i >=0 ; i--)
		{
			if(wa[i] == ' ')
			{
				wa[index-1]='0';
				wa[index-2]='2';
				wa[index-3]='%';
				index = index-3;
			}
			else
			{
				wa[index-1]=wa[i];
				index--;
			}
		}

		return new String(wa);
	}
}