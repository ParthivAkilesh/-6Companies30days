import java.util.*;

public class DijikstraAlgo 
{
    private static int V = 6;

    private int minKey(int[] key, boolean[] vis)
    {
        int min = Integer.MAX_VALUE, min_ind = -1;

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

    void printSP(int[] key)
    {   //System.out.println(Arrays.toString(key));
        for (int j=0; j<key.length; j++)
        {   //System.out.println(key[j]);
            System.out.printf("From %d to %d the Shortest path is %d \n",0, j, key[j]);
        }
    }

    private void sp(int[][] graph,int h)
    {
       // int[] par = new int[V];
        int[] key = new int[V];
        boolean[] vis = new boolean[V];

        for (int i=0; i<V; i++)
        {
            key[i] = Integer.MAX_VALUE;
            vis[i] = false;
        }

        //par[0] = -1;
        key[h] = 0;

        for (int vx=0; vx<V-1; vx++)
        {
            int u = minKey(key, vis);

            vis[u] = true;

            for (int v=0;v<V; v++)
            {
                if ((!vis[v] && graph[u][v]!=0)&&(key[u]+graph[u][v])<key[v] &&key[u]!=Integer.MAX_VALUE)
                    {
                        key[v] = (key[u]+graph[u][v]);
                    }                
            }
            // System.out.println(Arrays.toString(key));
        }

        printSP(key);
    }


    public static void main(String[] args) 
    {
        DijikstraAlgo d = new DijikstraAlgo();

        int[][] graph = new int[][] { {0, 2, 0, 0, 5, 0, 7},
            {0, 0, 3, 3, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 0, 2},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 3, 0, 1, 0}};

        d.sp(graph,0);
        
    }
}
