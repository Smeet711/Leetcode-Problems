//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.maxSumLCM(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static long maxSumLCM(int n) {
        // code here
        
        long sum = 0;
        int num = (int)Math.sqrt(n);
        for(int i=1;i<=num;i++){
            if(n%i == 0){
                sum += i;
                if(n/i != i){
                    sum += (n/i);
                }
            }
        }
        return sum;
    }
}