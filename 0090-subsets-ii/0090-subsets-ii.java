class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<>();
        
        findSubsets(0,nums,new ArrayList<>(),ansList);
        
        return ansList;
        
    }
    //
    //
    
    public void findSubsets(int index,int[] arr,List<Integer> list,List<List<Integer>> result){
        
        result.add(new ArrayList<>(list));
        
        for(int i = index;i < arr.length;i++){
            
            if( i != index && arr[i] == arr[i-1]){
                continue;
            }
            
            list.add(arr[i]);
            findSubsets(i+1,arr,list,result);
            list.remove(list.size()-1);
        }
    }
    
    //
    //
}