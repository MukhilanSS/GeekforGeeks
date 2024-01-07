//{ Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Solution g=new Solution();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int A[] , int n)
    {
        //add code here.
       // Your code Here
       Arrays.sort(A);
       int i=0,k=1,j=n-1;
       while(i<n-2){
          if(k>=j){
           i++;
           j=n-1;
           k=i+1;
           }
           else if((A[i]+A[k]+A[j])>0)
           j--;
           else if((A[i]+A[k]+A[j])<0)
           k++;
           else if((A[i]+A[k]+A[j])==0)
           return true;
 
       }
    return false;
    }
}
