#User function Template for python3


#Complete this function
class Solution:
    def floorSqrt(self, x): 
        ans=0
        sq=0
        i=1
        while(sq<x):
            sq=i*i
            if(sq<=x):
                ans=i
                i+=1
        return ans
            
        
# mid=(1+25)/2=13
# val=26
# high=13-1=12

#{ 
 # Driver Code Starts
#Initial Template for Python 3

import math



def main():
        T=int(input())
        while(T>0):
            
            x=int(input())
            
            print(Solution().floorSqrt(x))
            
            T-=1


if __name__ == "__main__":
    main()
# } Driver Code Ends