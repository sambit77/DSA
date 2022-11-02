import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		int n = 3; //No of discs
		int a = 1;  //source 
		int b = 2; 	//helper
		int c = 3;  //destn

		towerOfHanoi(n,a,b,c);
		
	}
	public static void towerOfHanoi(int n,int s,int h,int d)
	{
		if(n==1)
		{
			System.out.println("Move disc "+n+" from"+s+" to "+d);
			return;
		}

		towerOfHanoi(n-1,s,d,h);
		System.out.println("Move disc "+n+" from"+s+" to "+d);
		towerOfHanoi(n-1,h,s,d);
	}
}