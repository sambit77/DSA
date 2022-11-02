import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n);
		
	}
	public static void print(int n)
	{
		if(n==1)
		{
			return;
		}
		n--;
		System.out.println(n);
		print(n);
	}
}