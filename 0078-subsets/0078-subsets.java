class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        
         List<List<Integer>> result = new ArrayList<>();
        
        helper(nums,0,new ArrayList<>(),result);
        
        return result;
        
    }
    
    //
    public void helper(int[] nums,int i,List<Integer> ls,List<List<Integer>> ll){
        
        if(i==nums.length){
            ll.add(new ArrayList(ls));
            return;
        }
        helper(nums,i+1,ls,ll);
        ls.add(nums[i]);
        helper(nums,i+1,ls,ll);
        ls.remove(ls.size()-1);
    }
    
    
    //
    
}