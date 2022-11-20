class Solution {
    public int jump(int[] nums) {
        
        int jumpCount=0;
        int currEnd=0;
        int currFar =0;
        
        for(int i=0;i<nums.length;i++){
            if(i > nums.length ){
                return -1;
            }
            
            currFar = Math.max(currFar,i+nums[i]);

            if(i < nums.length-1 && i == currEnd){
                jumpCount++;
                currEnd = currFar;
            }
        }
        return jumpCount;
    }
}