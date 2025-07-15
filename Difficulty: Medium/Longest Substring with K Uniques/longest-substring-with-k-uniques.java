class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int freq[]=new int[26];
        int right=0,left=0,maxLen=-1,uCount=0;
        while(right<s.length())
        {
            freq[s.charAt(right)-'a']++;
            if(freq[s.charAt(right)-'a']==1) uCount++;
            if(uCount==k) maxL  en=Math.max(maxLen,right-left+1);
            while(uCount>k)
            {
                freq[s.charAt(left)-'a']--;
                if(freq[s.charAt(left)-'a']==0)
                    uCount--;
                left++;
            }
            right++;
        }
        return maxLen;
    }
}