import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int root = squareRoot(n);
		System.out.println(root);
	}
	public static int squareRoot(int n)
	{
		return squareRootHelper(n,0,n);
	}
	public static int squareRootHelper(int n,int min,int max)
	{
		if(max < min)
		{
			return -1;
		}
		int guess = (min+max)/2;
		if(guess*guess == n)
		{
			return guess;
		}
		else if(guess*guess < n)
		{
			return squareRootHelper(n,guess+1,max);
		}
		else
		{
			return squareRootHelper(n,min,guess-1);
		}

	}



}