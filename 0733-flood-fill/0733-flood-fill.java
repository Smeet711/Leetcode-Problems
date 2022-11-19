class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color){ 
            return image;
        }
        fill(image, sr, sc, color,image[sr][sc]);
        return image;
    }
    
    public void fill(int[][] image,int row,int col,int newcolor,int prevcolor){
        
        if(row < 0 || row >= image.length || col < 0 || col >=image[0].length){
            return;
        }
        
        if(image[row][col] != prevcolor){
            return;
        }
        
        
        image[row][col] = newcolor;
        
        fill(image,row,col+1,newcolor,prevcolor);
        fill(image,row+1,col,newcolor,prevcolor);
        fill(image,row-1,col,newcolor,prevcolor);
        fill(image,row,col-1,newcolor,prevcolor);
        
    }
}