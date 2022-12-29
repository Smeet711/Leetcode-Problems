//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int N;
            N = sc.nextInt();

            int[] asteroids = new int[N];
            for (int i = 0; i < N; i++) asteroids[i] = sc.nextInt();

            Solution obj = new Solution();
            int[] res = obj.asteroidCollision(N, asteroids);

            for (int e : res) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int[] asteroidCollision(int N, int[] asteroids) {
        // code here
        
        Stack<Integer> stck = new Stack<>();
        
        for(int value : asteroids){
            // if positive means moving in right simply Push
            if(value > 0){
                stck.push(value);
            }else{
                while(stck.size() > 0 && stck.peek() > 0 && stck.peek() < -value){
                    stck.pop();
                }
                // for same value 
                if(stck.size() > 0 && stck.peek() == -value){
                    stck.pop();
                }else if(stck.size() > 0 && stck.peek() > -value){
                    
                }else{
                    stck.push(value);
                }
            }
        }
        
        int[] result = new int[stck.size()];
        
        int i = result.length-1;
        
        while(i >= 0){
            result[i--] = stck.pop();
        }
        
        return result;
        
    }
}
