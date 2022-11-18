class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    
        ArrayList<List<Integer>> res= new ArrayList<>();
        
        if(nums == null || nums.length == 0){
            return res;
        }
        
        int n = nums.length;
        
        Arrays.sort(nums);
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                long target2 = (long)target - nums[j]-nums[i];
              
                int low = j+1;
                int high = n-1;
                
                while(low < high){
                    int twosum = nums[low]+nums[high];
                    
                    if(twosum < target2){
                        low++;
                    }else if(twosum > target2){
                        high--;
                    }else{
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[low]);
                        quad.add(nums[high]);
                        res.add(quad);
                        
                      while(low < high && nums[low] == quad.get(2)){
                          ++low;
                      }  
                        
                        while(low < high && nums[high] == quad.get(3)){
                          --high;
                      }
                      
                    }
                    
                    while(j+1 < n && nums[j+1] == nums[j]){
                        ++j;
                    }
                    while(i+1 < n && nums[i+1] == nums[i]){
                        ++i;
                    }
                    
                }
            }
        }
        
        
       return res; 
        
        
    }
}