//{ Driver Code Starts
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
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

class Pair{
    int first;
    int second;
    Pair(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
    
}
class Solution {
    void bfs(int row,int col,boolean [][]visit,char grid[][])
    {
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair>ans=new LinkedList<Pair>();
        ans.add(new Pair(row,col));
        visit[row][col]=true;
        while(!ans.isEmpty())
        {
            int r=ans.peek().first;
            int c=ans.peek().second;
            ans.poll();
            for(int i=-1;i<=1;i++)
            {
                for(int j=-1;j<=1;j++)
                {
                     int nrow=r+i;
                     int ncol=c+j;
                     if(nrow>=0&&nrow<n && ncol>=0 &&ncol<m &&
                        !visit[nrow][ncol] && grid[nrow][ncol]=='1')
                        {
                            visit[nrow][ncol]=true;
                            ans.add(new Pair(nrow,ncol));
                        }
                }
            }
        }
    }
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean visit[][]=new boolean[n][m];
        int count=0;
        
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<m;col++)
            {
                if(!visit[row][col]&& grid[row][col]=='1')
                {
                    count++;
                    bfs(row,col,visit,grid);
                }
            }
        }
        return count;
        // Code here
    }
}