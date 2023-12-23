#User function Template for python3


class Solution:
    def evenlyDivides (self, n):
        l=[]
        for i in str(n):
            l.append(i)
        count=0
        for i in l:
            if int(i)==0:
                continue
            elif n%int(i)==0:
                count+=1
        return count
        
        #User function Template for python3



        
        
         
        # code here

        
        
         
        # code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        N = int(input())
       

        ob = Solution()
        print(ob.evenlyDivides(N))
# } Driver Code Ends