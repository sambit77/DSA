import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		Stack<Integer> st = new Stack<Integer>();
		st.push(12);
		st.push(5);
		st.push(6);
		st.push(14);
		st.push(1);

		System.out.println(st.toString());
		int middle = (st.size()/2)+1;
		delMiddleElement(st,middle);
		System.out.println(st.toString());

		
	}

	public static void delMiddleElement(Stack<Integer> st,int mid)
	{
		if(st.size() == mid)
		{
			st.pop();
			return;
		}
		int val = st.pop();
		delMiddleElement(st,mid);
		st.push(val);
	}
}