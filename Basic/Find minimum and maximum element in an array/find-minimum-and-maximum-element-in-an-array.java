//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

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
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            Pair product = obj.getMinMax(a, n); 
            System.out.println(product.first+" "+product.second);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

/*
 class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 

Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
*/

class Compute 
{
    static Pair getMinMax(long a[], long n)  
    {
       long max=a[0];
       long min=a[0];
        //Write your code here
       if(n==1)
       return new Pair(min,max); 
       for(int i=0;i<n;i++)
        {
            if(a[i]>=max){
                max=a[i];
            }
            else if(a[i]<=min){
                min=a[i];
            }
        }
        return new Pair(min,max);
    }
}
