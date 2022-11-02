import java.util.*;
class A
{
	public static Set<String> s = new HashSet<String>();
	public static void main(String[] args) 
	{
		String ip = "aab";
		String op = ""; 
		printAllUniqueSubsets(ip,op);
		for(String i : s)
		{
			System.out.println(i);
		}
		
	}
	public static void printAllUniqueSubsets(String ip,String op)
	{
		if(ip.length() == 0)
		{
			//System.out.println(op);
			s.add(op);
			return;
		}

		String op1 = op;
		String op2 = op;
		op2 = op2 + ip.charAt(0);
		ip = ip.substring(1,ip.length()); //removing first char of the input

		printAllUniqueSubsets(ip,op1);
		printAllUniqueSubsets(ip,op2);
	}
}