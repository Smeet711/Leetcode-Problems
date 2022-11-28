//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            ArrayList<Integer> ans = new Solution().findSubarray(a, n);
            for(int i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    ArrayList<Integer> findSubarray(int a[], int n) {
        // code here
        
        int myStart=-1;
        int myEnd=-1;
        int start=-1;
        int end=-1;
        int maxSum = 0;
        int sum=0;
        ArrayList<Integer> result = new ArrayList<>();
        //
        for(int i=0;i<n;i++){
            
            if(a[i] < 0){
                sum=0;
                start=-1;
                end=-1;
            }else{
                if(start == -1 && end == -1){
                    start=i;
                    end=i;
                }else{
                    end+=1;
                }
                
                sum += a[i];
                //
                if(maxSum == sum){
                    int currLen = end-start+1;
                    int prevLen = myEnd-myStart+1;
                    
                  if(currLen > prevLen){
                      myStart = start;
                      myEnd = end;
                  }
                }
                //
                if(maxSum < sum){
                    myStart = start;
                    myEnd = end;
                    maxSum = sum;
                }
            }
        }
        //
        ////
        if(myStart == -1 && myEnd == -1){
            result.add(-1);
        }else{
            for(int i=myStart;i<=myEnd;i++){
                result.add(a[i]);
            }
        }
        ////
        
        
        return result;
        
    }
}