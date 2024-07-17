//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Solution obj = new Solution();
      int ans = obj.solve(a);
      System.out.println(ans);
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    static int solve(int bt[] ) {
    // code here
    PriorityQueue<Integer>p=new PriorityQueue<>();
    for(int i:bt)
    p.add(i);
    int t=0,wt=0;
    while(!p.isEmpty())
    {
        t+=wt;
        wt+=p.poll();
    }
    int ans=t/bt.length;
    return ans;
  }
}
     