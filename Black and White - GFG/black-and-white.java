//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Driverclass {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println(new BlackAndWhite().numOfWays(N, M));
        }
    }
}
// } Driver Code Ends


class BlackAndWhite
{
    //Function to find out the number of ways we can place a black and a 
    //white Knight on this chessboard such that they cannot attack each other.
    static long numOfWays(int N, int M)
    {
        // add your code here
        long mod=(long)Math.pow(10,9)+7;
        long TotalPos=N*M;
        long ans=0;
        int xCord[]={2,1,-1,-2,-2,-1,1,2};
        int yCord[]={1,2,2,1,-1,-2,-2,-1};
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                int x_axis=i;
                int y_axis=j;
                int possiblePlaces=0;
                for(int k=0;k<8;k++){
                    int newX=x_axis+xCord[k];
                    int newY=y_axis+yCord[k];
                    if(newX>=0&&newX<N&&newY>=0&&newY<M){
                        possiblePlaces++;
                    }
                }
                //System.out.print(TotalPos-possiblePlaces-1+" ");
                ans=(ans%mod+(TotalPos-possiblePlaces-1)%mod)%mod;
            }
        }
        return ans%mod;
    }
}