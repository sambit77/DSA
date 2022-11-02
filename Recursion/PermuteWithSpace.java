import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		String ip = "ABC";
		String op = String.valueOf(ip.charAt(0));
		ip = ip.substring(1,ip.length());

		permuteWithSpace(ip,op);	
	}
	public static void permuteWithSpace(String ip,String op)
	{
		if(ip.length() == 0)
		{
			System.out.println(op);
			return;
		}

		String op1 = op;
		String op2 = op;

		op1 = op1 + ip.charAt(0);
		op2 = op2 + '_' + ip.charAt(0);
		ip = ip.substring(1,ip.length());

		permuteWithSpace(ip,op1);
		permuteWithSpace(ip,op2);
	}
}