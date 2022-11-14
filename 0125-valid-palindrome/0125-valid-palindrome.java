class Solution {
    public boolean isPalindrome(String s) {
        
       if(s.isEmpty()){
           return false;
       }
        
       int i=0,j=s.length()-1;
        
       
        
        while( i<= j ){
        char chead = s.charAt(i);
        char ctail = s.charAt(j);
            
           if(!Character.isLetterOrDigit(chead)){
               i++;
           }else if(!Character.isLetterOrDigit(ctail)){
               j--;
           }else{
               if(Character.toLowerCase(chead) !=  Character.toLowerCase(ctail)){
                   return false;
               }
               i++;
               j--;
           } 
            
        }
        return true;
    }
}