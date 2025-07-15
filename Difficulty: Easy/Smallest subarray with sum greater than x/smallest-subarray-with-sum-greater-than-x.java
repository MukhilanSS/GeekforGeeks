// User function Template for Java

class Solution {

    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        int right=0,left=0,sum=0,minLen=Integer.MAX_VALUE;
        while(right<arr.length)
        {
            sum+=arr[right];
            while(sum>=x)
            {
                minLen=Math.min(minLen,right-left+1);
                sum-=arr[left++];
            }
            right++;
        }
        return minLen==Integer.MAX_VALUE?0:minLen;
    }
}
