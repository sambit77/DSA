import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		String ip = "ab";
		String op = "";
		

		permuteWithCaseChange(ip,op);	
	}
	public static void permuteWithCaseChange(String ip,String op)
	{
		if(ip.length() == 0)
		{
			System.out.println(op);
			return;
		}

		String op1 = op + ip.charAt(0);
		String op2 = op + Character.toUpperCase(ip.charAt(0));
		ip = ip.substring(1,ip.length());

		permuteWithCaseChange(ip,op1);
		permuteWithCaseChange(ip,op2);
	}
}