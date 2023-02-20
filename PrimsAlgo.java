import java.util.*;

public class PrimsAlgo 
{


    private static final int V = 5;


    private int minVal(int[] key, boolean[] vis)
    {
        int min = Integer.MAX_VALUE;
        int min_ind = -1;

        for (int v=0; v<V; v++)
        {
            if (vis[v]==false && key[v]<min)
            {
                min = key[v];
                min_ind = v;
            }
        }
        return min_ind;
    }

    private void printEdges(int[] par, int[] key) 
    {
        for (int j=1; j<par.length; j++)
        {
            System.out.println(par[j]+" -"+key[j]+"-> "+j);
        }
    }


    private void mst(int graph[][])
    {
        int par[] = new int[V];
        int key[] = new int[V];
        boolean vis[] = new boolean[V];
        for (int x=0; x<V; x++)
        {
            key[x] = Integer.MAX_VALUE;
            vis[x] = false;
        }
        par[0] = -1;
        key[0] = 0;

        for (int vx=0; vx<V-1; vx++)
        {
            int u = minVal(key, vis);
            System.out.println("u: "+u);
            vis[u] = true;

            for (int v=0; v<V; v++)
            {
                if (graph[u][v]!=0 && vis[v]==false && graph[u][v]<key[v])
                {
                    key[v] = graph[u][v];
                    par[v] = u;
                }
            }

        }

        printEdges(par, key);
    }


    public static void main(String[] args) 
    {
        PrimsAlgo p = new PrimsAlgo();
        int graph[][] = new int[][] { { 0, 2, 0, 6, 0 },
                                        { 2, 0, 3, 8, 5 },
                                        { 0, 3, 0, 0, 7 },
                                        { 6, 8, 0, 0, 9 },
                                        { 0, 5, 7, 9, 0 } };

        p.mst(graph);
        
    }
    
}
