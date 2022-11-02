import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		Stack<Integer> st = new Stack<Integer>();
		st.push(12);
		st.push(5);
		st.push(14);
		st.push(1);

		System.out.println(st.toString());
		sort(st);
		System.out.println(st.toString());
		
	}
	public static void sort(Stack<Integer> st)
	{
		if(st.size()==1)
			return;

		int temp = st.pop();
		sort(st);
		insert(st,temp);
	}
	public static void insert(Stack<Integer> st,int temp)
	{
		if(st.size()==0 || st.peek() <= temp)
		{
			st.push(temp);
			return;
		}

		int val = st.pop();
		insert(st,temp);
		st.push(val);
	}
}