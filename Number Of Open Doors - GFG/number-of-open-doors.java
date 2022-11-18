//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.noOfOpenDoors(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int noOfOpenDoors(Long N) {
        // code here
        
        double ans = Math.sqrt(N+1)-1;
        
        return (int)(Math.ceil(ans));
        
        
        // total number of perfect square till N will remain Open becuase they are odd factors in it .
        
        
        // Eg . N = 4
        
        // factors of N =  1,2,4    - odd number  factors 
        
        // In this 1 and 4 are perfect sqaure 
        
        // 1 is perfect sqaure and 4 is perfect sqaure till N
        
        // Eg .  N = 10
        
        // doors- 1,4,9 will remain open
        
        
        
        
        
    }
};