//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isTwistedPrime(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int reverse(int n){
        int rev=0;
        while(n!=0)
        {
            rev=rev*10+(n%10);
            n/=10;
        }
    return rev;
    }
    public boolean isprime(int n)
    {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
    
    int isTwistedPrime(int n) {
        // code here
        if(isprime(n) && isprime(reverse(n))) return 1;
        return 0;
    }
}