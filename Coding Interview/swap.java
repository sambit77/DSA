import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int[] str = new int[]{9,9,3,9,5};
		int xorcnt = str[0];

		for(int i = 1 ; i < str.length ; i++)
		{
			xorcnt = xorcnt ^ (str[i]);
		}

		System.out.println(xorcnt);
		if(xorcnt == 0)
		{
			System.out.println("All not unique");
		}
		else
		{
			System.out.println("All unique");
		}
		
	}
}