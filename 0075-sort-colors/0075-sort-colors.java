class Solution {
    int temp;
    public void sortColors(int[] nums) {
        
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i] > nums[j]){
//                     int temp = nums[i];
//                     nums[i] = nums[j];
//                     nums[j] = temp;
//                 }
//             }
//         }
        
        // O(n) complexity
        
        
        int i=0,j=nums.length-1,k=j;
        
        while(i <= j){
            int curr = nums[j];
            if(curr == 0){
                swap(nums,i++,j);
            }else if(curr == 2){
                swap(nums,j--,k--);
            }else{
                j--;
            }
        }
    }
    
    public void swap(int[] nums,int i,int j){
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    }
