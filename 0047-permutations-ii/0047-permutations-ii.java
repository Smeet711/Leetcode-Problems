class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        if(nums == null || nums.length == 0){
            return result;
        }
        
        boolean[] visited = new boolean[nums.length];
        
        Arrays.sort(nums);
        uniquePermute(nums,visited,list,result);
         
        return result;
        
    }
    
    //
    public void uniquePermute(int[] nums,boolean[] vis, List<Integer> list,  List<List<Integer>> result ){
        
        if(list.size() == nums.length){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            
            if(vis[i]){
                continue;
            }
            
            if(i > 0 && nums[i-1] == nums[i] && !vis[i-1]){
                continue;
            }
            
            vis[i] = true;
            list.add(nums[i]);
            uniquePermute(nums,vis,list,result);
            vis[i] = false;
            list.remove(list.size()-1);
        }
        
    }
    
    //
    
}