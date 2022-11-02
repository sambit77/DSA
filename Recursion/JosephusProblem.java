import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		int n = 40;
		ArrayList<Integer> al = new ArrayList<Integer>();
		int k = 7;
		int index = 0;
		for(int i = 0 ; i < 40 ; i++)
		{
			al.add(i);
		}
		printPosn(n,k-1,al,index);
		
	}
	public static void printPosn(int n, int k , ArrayList<Integer> al,int index)
	{
		if(al.size()==1)
		{
			System.out.println(al.get(0));
			return;
		}
		index = (index + k) % al.size() ;
		al.remove(index);
		printPosn(n,k,al,index);
	}
}