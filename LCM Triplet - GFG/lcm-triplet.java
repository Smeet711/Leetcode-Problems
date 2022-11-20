//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long N = Long.parseLong(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.lcmTriplets(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long lcmTriplets(long N) {
        // code here
        
        
        // base case if N=0,1,2 any number less then or equal to 2
        if(N <= 2){
            return N;
        }
        
        // first will check if N is even number or not
        
        if(N%2 == 0 ){
            // then for triplets we will
            if(N%3 == 0){
                return (N-1)*(N-2)*(N-3);
            }else{
                return (N-1)*(N-3)*(N);
            }
        }else{
            return (N-2)*(N-1)*(N); // if N is odd then 
        }
        
    }
}