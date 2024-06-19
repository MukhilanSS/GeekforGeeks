import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	     Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t-->0)
	     {
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        HashMap<Integer,Integer>map=new HashMap<>();
	        List<Integer>ans=new ArrayList<>();
	        for(int i:arr)
	        {
	            map.put(i,map.getOrDefault(i,0)+1);
	            ans.add(i);     
	        }
	        Collections.sort(ans,(n1,n2)->{
	            int f1=map.get(n1);
	            int f2=map.get(n2);
	            if(f1!=f2) return f2-f1; // descending freqency
	            return n1-n2; //ascending numbers
	        });
	        for(int i:ans)
	        {
	            System.out.print(i+" ");
	        }
	        System.out.println();
	     }
	 //code
	 }
}