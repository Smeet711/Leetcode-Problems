//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            String[] s1 = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < s1.length; i++)
                nums[i] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int ans = ob.LongestBitonicSequence(nums);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestBitonicSequence(int[] nums)
    {
        // Code here
        
        int n = nums.length;
        int[] incDp = new int[n];
        
        for(int i=0;i<n;i++){
            incDp[i] = 1;
            for(int j=0;j<i;j++){
                if(nums[j] < nums[i] && incDp[j]+1 > incDp[i] ){
                    incDp[i] = incDp[j]+1;
                }
            }
        }
        
        
        
        int[] decDp = new int[n];
        
        for(int i=n-1;i>=0;i--){
            decDp[i] = 1;
            for(int j=i+1;j<n;j++){
                if(nums[j] < nums[i] && decDp[j]+1 > decDp[i] ){
                    decDp[i] = decDp[j]+1;
                }
            }
        }
        
        int ans=0;
        
        for(int i=0;i<n;i++){
            ans = Math.max(ans,incDp[i]+decDp[i]-1);
        }
        
        return ans;
    }
}