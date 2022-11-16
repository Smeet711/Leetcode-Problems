class Solution {
    
   private int perform(int a, int b, char c){
        if(c=='+'){
            return a+b;
        }else if(c=='-'){
            return a-b;
        }else if(c=='*'){
            return a*b;
        }
        return 0;
    }
    public List<Integer> diffWaysToCompute(String expression) {
        boolean isNumeric=true;
        List<Integer> dp = new ArrayList<Integer>();
        for(int i=0; i<expression.length(); i++){
            char c = expression.charAt(i);
            if(c == '*' || c == '-' || c == '+'){
                isNumeric = false;
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i+1, expression.length()));
                for(int l=0; l<left.size(); l++){
                    for(int r=0; r<right.size(); r++){
                        dp.add(perform(left.get(l), right.get(r), c));
                    }   
                }
            }
        }
        if(isNumeric){
            dp.add(Integer.parseInt(expression));
        }
        return dp;
    }
}