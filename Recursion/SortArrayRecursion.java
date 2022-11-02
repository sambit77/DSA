import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(15);
		al.add(3);
		al.add(1);
		al.add(25);
		al.add(7);
		al.add(6);

		System.out.println(al.toString());

		sort(al);

		System.out.println(al.toString());
	}
	public static void sort(ArrayList<Integer> al)
	{

		if(al.size()==1)
		{
			return;
		}

		int temp = al.get(al.size()-1);
		al.remove(al.size()-1);
		sort(al);
		insert(al,temp);
	}
	public static void insert(ArrayList<Integer> al,int n)
	{
		if(al.size()==0 || al.get(al.size()-1) <= n)
		{
			al.add(n);
			return;
		}

		int val = al.get(al.size()-1);
		al.remove(al.size()-1);
		insert(al,n);
		al.add(val);

	}
} 