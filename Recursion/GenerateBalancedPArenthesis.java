import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		int n = 3;
		int open = n;
		int close = n;
		String op = "";

		generate(open,close,op);
		
	}

	public static void generate(int open,int close,String op)
	{
		if(open == 0 && close == 0)
		{
			System.out.println(op);
			return;
		}

		if(open != 0)
		{
			String op1 = op + '(';
			generate(open-1,close,op1);
		}
		if(close > open)
		{
			String op2 = op + ')';
			generate(open,close-1,op2);
		}
	}
}