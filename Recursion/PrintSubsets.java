import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		String ip = "ab";
		String op = ""; 
		printSubsets(ip,op);
		
	}
	public static void printSubsets(String ip,String op)
	{
		if(ip.length() == 0)
		{
			System.out.println(op);
			return;
		}

		String op1 = op;
		String op2 = op;
		op2 = op2 + ip.charAt(0);
		ip = ip.substring(1,ip.length()); //removing first char of the input

		printSubsets(ip,op1);
		printSubsets(ip,op2);
	}
}