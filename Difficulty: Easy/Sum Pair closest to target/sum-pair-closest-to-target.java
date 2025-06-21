// User function Template for Java

class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        List<Integer> ans=new ArrayList<>();
        int currSum=0;
        int min=Integer.MAX_VALUE;
        while(i<j)
        {
            currSum=arr[i]+arr[j];
            if(Math.abs(currSum-target)<min)
            {
                min=Math.abs(currSum-target);
                ans=Arrays.asList(arr[i],arr[j]);
            }
            if(currSum<target) i++;
            else if(currSum>target) j--;
            else return ans;
        }
        return ans;
    }
}