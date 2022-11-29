class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>> ans = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        palindromePartition(0,s,ds,ans);
        
        return ans;
        
    }
    //
    public void palindromePartition(int index,String str,List<String> ds,List<List<String>> ans){
        
        if(index == str.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=index;i<str.length();i++){
            
            if(isPalindrome(str,index,i)){
                ds.add(str.substring(index,i+1));
                palindromePartition(i+1,str,ds,ans);
                ds.remove(ds.size()-1);
            }
        }
    }
   //
    
    public boolean isPalindrome(String s,int start,int end){
        
        while(start <= end){
            
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
    //
    
}