import java.util.*;

public class DFS 
{
 private int V;
 private int x=0;
 private LinkedList<Integer> adj[];

 DFS(int v)
 {
    V = v;
    adj = new LinkedList[V];
    for (int i=0; i<V; i++)
    {
        adj[i] = new LinkedList();
    }
 }

 void addEdge(int u, int v)
 {
    adj[u].add(v);
 }

 void dfsUtil(int v, boolean[] vis)
 {
    x += 1;
    vis[v] = true;
    System.out.println(v+" "+x);

    Iterator<Integer> i = adj[v].listIterator();

    while(i.hasNext())
    {
        int n = i.next();
        if (!vis[n])
        {
            dfsUtil(n, vis);
        }
    }
 }

 void dfsearch(int s)
 {
    boolean vis[] = new boolean[V];

    dfsUtil(s, vis);

 }

 public static void main(String[] args) 
    {
        DFS g = new DFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.dfsearch(3);
    }


}
