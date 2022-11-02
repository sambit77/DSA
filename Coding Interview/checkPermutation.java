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
		return sort(s).equals(sort(t));
	}
	public static String sort(String str)
	{
		char[] srr = str.toCharArray();
		Arrays.sort(srr);
		return new String(srr);
	}

}