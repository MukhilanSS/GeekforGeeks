//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int sizeOfArray = Integer.parseInt(read.readLine());
            int arr[] = new int[sizeOfArray];
            
            String st[] = read.readLine().trim().split("\\s+");
            for(int i = 0; i < sizeOfArray; i++)
              arr[i] = Integer.parseInt(st[i]);
              
            int x = Integer.parseInt(read.readLine());
            
            Solution obj = new Solution();
            
            System.out.println(obj.search(arr, sizeOfArray, x));
        }
    }
}
// } Driver Code Ends


// class Solution {
//     static int search(int arr[], int N, int X) {
//         int i = 0, index = -1;

//         while (N-->0) {
//             if (arr[i] == X) 
//                 index = i;
//                 i++;
//         }

//         return index;
//     }
// }
class Solution{
        
    static int search(int arr[], int N, int X){
        //Traverse whole array and check 
        // if present return index value 
        // if not present return -1
        for(int i=0 ; i< N ; i++){
            if(arr[i]==X){
                return i;
            }
        }
        return -1;
    }
    
}
