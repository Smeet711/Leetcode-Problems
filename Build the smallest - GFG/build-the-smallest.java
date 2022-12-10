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
            int N = Integer.parseInt(read.readLine());
            String str = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.buildLowestNumber(str,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String buildLowestNumber(String str, int N) {
        // code here
        
        Stack<Integer> stack = new Stack<>();
        stack.push(((int)str.charAt(0)) - 48);

        

        for(int i=1;i<str.length();i++){

            int e = ((int)str.charAt(i)) - 48;


            while(N > 0 && stack.size() > 0 && stack.peek() > e){

                stack.pop();

                N--;

            }

            stack.push(e);

        }

        

        while(N != 0){

            stack.pop();

            N--;

        }

        

        StringBuilder sb = new StringBuilder();

        

        for(int i : stack){

            if(sb.length() == 0 && i == 0)

                continue;

            sb.append(i);

        }

        

        if(sb.length() == 0)

            return "0";

        else

            return sb.toString();
    }
}