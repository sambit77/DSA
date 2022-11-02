import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		powersOf2(n);
		
	}
	public static int powersOf2(int n)
	{
		if(n<0)
		{
			return 0;
		}
		else if(n==1)
		{
			System.out.println(1);
			return 1;
		}
		else
		{
			int prev = powersOf2(n/2);
			int curr = prev * 2;
			System.out.println(curr);
			return curr;
		}
	}
}