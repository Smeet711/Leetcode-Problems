class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> res = new ArrayList<>();
        
        generate(res,"",0,0,n);
        
        return res;
        
    }
    
    public void generate(List<String> res,String str,int open,int close,int max){
        
        if(str.length() == max*2){
            res.add(str);
            return;
        }
        
        if(open < max){
            generate(res,str+"(",open+1,close,max);
        }
         if(close < open ){
            generate(res,str+")",open,close+1,max);
        }
    }
    
}