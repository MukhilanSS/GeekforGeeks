//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i < n; i++)
                nums[i] = sc.nextInt();
            Solution ob = new Solution();
            int[] ans = ob.common_digits(nums);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] common_digits(int[] nums)
    {
        // code here
        int temp=Integer.MIN_VALUE;
        Set<Integer>res=new HashSet<Integer>();
        for(int i:nums)
        {
            int n=i,rev=0;
            while(n!=0)
            {
                int r=n%10;
                rev=rev*10+r;
                n/=10;
                if(temp!=r)
                {
                    temp=r;
                    res.add(temp);
                }
                
            }
        }
        int k=0;
        int ans[]=new int[res.size()];
        for(int i:res)
        ans[k++]=i;
        return ans;
    }
}