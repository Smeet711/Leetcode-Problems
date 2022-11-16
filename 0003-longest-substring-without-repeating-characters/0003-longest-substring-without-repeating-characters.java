class Solution {
    public int lengthOfLongestSubstring(String s) {
//          int i = 0, j = 0, max = 0;
//     Set<Character> set = new HashSet<>();
    
//     while (j < s.length()) {
//         if (!set.contains(s.charAt(j))) {
//             set.add(s.charAt(j++));
//             max = Math.max(max, set.size());
//         } else {
//             set.remove(s.charAt(i++));
//         }
//     }
    
//     return max;
        // TC : O(2N)
        // SC : O(N)
 
        // optimal solution
        //Tc :  O(N)
        // SC : o(N)
        HashMap<Character,Integer> map = new HashMap<>();
        
        int left = 0,right = 0;
        int n = s.length();
        
        int max = 0;
        
        while(right < n){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(map.get(s.charAt(right))+1,left);
                
            }
                map.put(s.charAt(right),right);
                max = Math.max(max,right-left+1);
                right++;
        }
        return max;
        
    }
}