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
            String s = br.readLine().trim();
            int k = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.characterReplacement(s, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int characterReplacement(String s, int k)
    {
        // code here
        
        int i=0;
        int j=0;
        int max = 0;
        int ans = 0;
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        while(j < s.length()){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            
            max = Math.max(max,map.get(s.charAt(j)));
            
            if((j-i+1)-max > k ){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;
            }
            
            ans = Math.max(ans,j-i+1);
            j++;
            // basically sliding through a window with max occurecnce of elment
            
        }
        
        return ans;
        
    }
}