class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        
        helper(1,n,subset,ans);
        
        List<List<Integer>> result = new ArrayList<>();
        
        for(List<Integer> list : ans){
            if(list.size() == k){
                result.add(list);
            }
        }
        
        
        return result;
        
    }
    
    //
    public void helper(int start,int end, List<Integer> subset,List<List<Integer>> ans){
    
        if(start >= end+1){
            ans.add(new ArrayList<>(subset));
            return;
        }
        
        subset.add(start);
        helper(start+1,end,subset,ans);
        
        subset.remove(subset.size()-1);
        helper(start+1,end,subset,ans);
        
        
    }
    
    //
    
}