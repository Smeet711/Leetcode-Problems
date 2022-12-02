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
            String S[] = read.readLine().split(" ");
            Solution ob = new Solution();
            System.out.println(
                ob.isItPossible(S[0], S[1], S[0].length(), S[1].length()));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isItPossible(String S, String T, int M, int N) {
        // code here
         int count1=0, count2=0;

        if(M  != N ) return 0;

        for(int i=0; i< M; i++){

            if(S.charAt(i) != '#') count1++;

        }

        for(int i=0; i< N; i++){

            if(T.charAt(i) != '#') count2++;

        }

        if(count1 == 0 && count2 == 0) return 1;

        if(count1 != count2) return 0;

        int i=0, j=0;

        while(i< M && j< N){

            while(i<M && S.charAt(i) =='#') i++;

            while(j< N && T.charAt(j) == '#') j++;

            if(i< M && j< N){

                if(S.charAt(i) != T.charAt(j)) return 0;

                else {

                    if(S.charAt(i) == 'A' && T.charAt(j) == 'A'){

                        if(i< j) return 0;

                        else {

                            i++;

                            j++;

                        }

                    }else{

                        if(i> j) return 0;

                        i++;

                        j++;

                    }

                }

            }
        }

        return 1;
    }
};