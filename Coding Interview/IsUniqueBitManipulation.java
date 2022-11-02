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
		int checker = 0;

		for(int i = 0 ; i < st.length() ; i++)
		{
			int bitAtIndex = st.charAt(i)-'a';

			if((checker & (1 << bitAtIndex)) > 0)
			{
				return false;
			}

			checker = checker | (1 << bitAtIndex);
		}
		return true;
	}
}