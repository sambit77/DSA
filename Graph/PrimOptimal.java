import java.util.*;
class Node implements Comparator<Node>
	{
		private int v;
		private int weight;

		public Node(int _v,int _w)
		{
			v = _v;
			weight = _w;
		}
		Node()
		{

		}
		int getV()
		{
			return v;
		}
		int getWeight()
		{
			return weight;
		}
		@Override
		public int compare(Node n1,Node n2)
		{
			if(n1.getWeight() < n2.getWeight())
			{
				return -1;
			}
			if(n1.getWeight() > n2.getWeight())
			{
				return 1;
			}
			return 0;
		}
	}
class Main
{
	
	public void prim(ArrayList<ArrayList<Node>> adj,int N)
	{
		int[] parent = new int[N];
		int[] key = new int[N];
		boolean[] mst = new boolean[N];

		PriorityQueue<Node> pq = new PriorityQueue<Node>(N,new Node());


		for(int i = 0 ; i < N ; i++)
		{
			parent[i]=-1;
			mst[i]=false;
			key[i]=Integer.MAX_VALUE;
		}

		key[0]=0;
		pq.add(new Node(0,key[0]));

		for(int i = 0 ; i < N-1; i++)
		{
			//int min = Integer.MAX_VALUE;
			//int u = 0;
			/*for(int v = 0 ; v < N ; v++)
			{
				if(key[v]<min && mst[v]==false)
				{
					min = key[v];
					u=v;
				}
			}*/
			int u = pq.poll().getV();
			mst[u]=true;

			for(Node it :adj.get(u))
			{
				if(mst[it.getV()] == false && it.getWeight() < key[it.getV()])
				{
					parent[it.getV()]=u;
					key[it.getV()]=it.getWeight();

					//New line added
					pq.add(new Node(it.getV(),key[it.getV()]));
				}
			}
		}

		//print MST
		for(int i = 1 ; i < N ; i++)
		{
			System.out.println(parent[i]+"->"+i);
		}

	}
	public static void main(String[] args) {
		int n = 5;
		ArrayList<ArrayList<Node>> adj = new ArrayList<ArrayList<Node>>();
		for(int i = 0 ; i < n ; i++)
		{
			adj.add(new ArrayList<Node>());
		}

		adj.get(0).add(new Node(1,2));
		adj.get(1).add(new Node(0,2));

		adj.get(1).add(new Node(2,3));
		adj.get(2).add(new Node(1,3));

		adj.get(0).add(new Node(3,6));
		adj.get(3).add(new Node(0,6));

		adj.get(1).add(new Node(3,8));
		adj.get(3).add(new Node(1,8));

		adj.get(1).add(new Node(4,5));
		adj.get(4).add(new Node(1,5));

		adj.get(2).add(new Node(4,7));
		adj.get(4).add(new Node(2,7));

		Main obj = new Main();
		obj.prim(adj,n);
	}
}