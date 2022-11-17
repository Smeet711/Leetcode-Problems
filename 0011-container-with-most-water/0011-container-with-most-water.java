class Solution {
    public int maxArea(int[] height) {
        
        int leftPtr = 0;
        int rightPtr = height.length-1;
        
        int maxWater = 0;
        
        while(leftPtr < rightPtr){
            
            int w = rightPtr - leftPtr;
            int h = Math.min(height[leftPtr],height[rightPtr]);
            int area = w * h;
            maxWater = Math.max(maxWater,area);
            
            if(height[leftPtr] < height[rightPtr]){
                leftPtr++;
            }else if(height[rightPtr] < height[leftPtr]){
                rightPtr--;
            }else{
                leftPtr++;
                rightPtr--;
            }
        }
        return maxWater;
    }
}