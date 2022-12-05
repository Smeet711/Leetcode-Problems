//{ Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String St[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(St[0]);
            int m = Integer.parseInt(St[1]);
            int k = Integer.parseInt(St[2]);
            
            int[][] mat = new int[n][m];
            
            for(int i=0; i<n; i++)
            {
                String S[] = read.readLine().split(" ");
                for(int j=0; j<m; j++)
                    mat[i][j] = Integer.parseInt(S[j]);
            }

            Solution ob = new Solution();
            System.out.println(ob.shotestPath(mat,n,m,k));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Node{
    int x,y,k,dist;
    Node(int x,int y,int k,int dist){
        this.x=x;
        this.y=y;
        this.k=k;
        this.dist=dist;
    }
}




class Solution {
    static int shotestPath(int[][] mat, int m, int n, int k) {
        // code here
        
        int dx[] = {0,0,1,-1};
        int dy[] = {1,-1,0,0};      // basically corordinates of 4 directions  
        
        Queue<Node> q = new LinkedList<>();
        boolean vis[][][] = new boolean[m][n][k+1];
        int ans = Integer.MAX_VALUE;
        
        vis[0][0][0] = true;
        q.add(new Node(0,0,0,0));
        
        while(!q.isEmpty()){
            Node curr = q.poll();
           
           if(curr.x == m-1 && curr.y == n-1){
              ans = Math.min(ans,curr.dist);
              return ans;
           } 
            
        for(int i=0;i<4;i++){
            int newx = curr.x + dx[i];
            int newy = curr.y + dy[i];
            
            if(newx >= 0 && newx < m && newy >= 0 && newy < n){
                int newk = curr.k + mat[newx][newy];
                if(newk <= k && !vis[newx][newy][newk]){
                    vis[newx][newy][newk] = true;
                    q.add(new Node(newx,newy,newk,curr.dist+1));
                }
            }
        }
        }
        
        return -1;
        
    }
};