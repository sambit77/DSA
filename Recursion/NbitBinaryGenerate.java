//GEnerate all N-bit binary numbers having more or equal number of one's tham zero's in all its prefix
import java.util.*;
class A
{
	public static void main(String[] args) {
		int n = 3;
		int one = 0;
		int zero = 0;
		String op = "";

		generate(n,one,zero,op);

	}
	public static void generate(int n,int one,int zero,String op)
	{
		if(n==0)
		{
			System.out.println(op);
			return;
		}

		String op1 = op + '1';
		generate(n-1,one+1,zero,op1);

		if(one > zero)
		{
			String op2 = op + '0';
			generate(n-1,one,zero+1,op2);
		}
	}
}