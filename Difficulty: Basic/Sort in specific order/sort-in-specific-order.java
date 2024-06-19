//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution ob = new Solution();
            ob.sortIt(a, n);
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
            output.append(a[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution {

    public void sortIt(long arr[], long n) {
        int i=0,j=(int)n-1,ind=0;
        while(i!=j){
            long max=0;
            for(int k=i;k<=j;k++)
            {
                if(arr[k]>max)
                {
                    max=arr[k];
                    ind=k;
                }
            }
            if(max%2!=0)
            {
                arr[ind]=arr[i];
                arr[i]=max;
                i++;
            }
            else{
                arr[ind]=arr[j];
                arr[j]=max;
                j--;
            }
        }
        
    }
}