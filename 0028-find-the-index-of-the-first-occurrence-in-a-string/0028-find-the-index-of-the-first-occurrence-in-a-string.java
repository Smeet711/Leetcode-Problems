class Solution {
    public int strStr(String haystack, String needle) {
        
        
//         if(needle == "" || needle.length() == 0){
//             return 0;
//         }
        
//         char c = needle.charAt(0);
//         int index=0;
//         boolean flag = false;
//         for(int i=0;i<haystack.length()-1;i++){
//             if(haystack.charAt(i) == c){
//                 index = i;
//                 flag = true;
//                 break;
//             }
//         }
        
//         if(flag){
//             return index;
//         }else{
//             return -1;
//         }
        
        
    for (int i = 0; ; i++) {
    for (int j = 0; ; j++){
      if (j == needle.length()){ 
          return i;
      }
      if (i + j == haystack.length()){ 
          return -1;
      }
      if (needle.charAt(j) != haystack.charAt(i + j)){ 
          break;
      }
    }
  }
        
    }
}