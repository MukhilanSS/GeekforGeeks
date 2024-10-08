//{ Driver Code Starts
// Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                // adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.bfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    void bfsfun(Queue<Integer> q,boolean visit[],ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> bfs)
    {
        if(q.isEmpty())
            return ;
        int node=q.poll();
        bfs.add(node);
        for(int i:adj.get(node))
        {
            if(!visit[i])
            {
                visit[i]=true;
                q.add(i);
            }
        }
        bfsfun(q,visit,adj,bfs);
    }
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer>bfs=new ArrayList<>();
        boolean visit[] =new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        // q.add(0);
        // visit[0]=true;
        // while(!q.isEmpty())
        // {
        //     int node=q.poll();
        //     bfs.add(node);
        //     for(int i:adj.get(node))
        //     {
        //         if(!visit[i])
        //         {
        //             visit[i]=true;
        //             q.add(i);
        //         }
        //     }
        // }
        
        q.add(0);
        visit[0]=true;
        bfsfun(q,visit,adj,bfs);
        return bfs;
        // Code here
    }
}