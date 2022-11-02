import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(squareRoot(n));
		
	}
	public static int squareRoot(int n)
	{
		for(int i = 0 ; i*i <= n ; i++)
		{
			if(i*i == n)
			{
				return i;
			}
		}
		return -1;
	}
}