#User function Template for python3

class Solution:
    #Complete this function
    def power(self,x,n):
            # if n==0:
            #     return 1
            # if x==0:
            #     return 0
            # temp=self.power(x,n//2)
            # temp=temp*temp
            # if(n%2==0):
            #     return temp%100000007
            # else:
            #     return (temp*x)%100000007
            return pow(x,n,1000000007)

#{ 
 # Driver Code Starts
#Initial Template for Python 3

import math

def main():
    
    T=int(input())
    
    while(T>0):
        
        N=input()
        R=N[::-1]
        
        ob=Solution();
        ans=ob.power(int(N),int(R))
        print(ans)
        
        T-=1

if __name__=="__main__":
    main()
# } Driver Code Ends