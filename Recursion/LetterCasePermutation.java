import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		String ip = "a1B2";
		String op = "";
		   

		letterCasePermutation(ip,op);	
	}
	public static void letterCasePermutation(String ip,String op)
	{
		if(ip.length() == 0)
		{
			System.out.println(op);
			return;
		}

		if(Character.isDigit(ip.charAt(0)))
		{
			op = op + ip.charAt(0);
			ip=ip.substring(1,ip.length());
			letterCasePermutation(ip,op);
		}
		else
		{
			char ch = ip.charAt(0);
			String op1 = op + Character.toLowerCase(ch);
			String op2 = op + Character.toUpperCase(ch);
			ip = ip.substring(1,ip.length());
			letterCasePermutation(ip,op1);
			letterCasePermutation(ip,op2);
		}
	}
}