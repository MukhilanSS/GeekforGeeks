//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        // code here
        int x=n;
        // System.out.println(x);
        int sum=0;
        int r;
        while(n>0){
            r=n%10;
            sum=(int)(sum+Math.pow(r,3));
            n=n/10;
        }
        if(sum==x)
        return "Yes";
        else
        return "No";
    }
 
}