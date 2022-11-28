/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        
         pathSuminBT(root,targetSum,list,result);
        return result;
    }
    //
    public void pathSuminBT(TreeNode root,int targetSum, List<Integer> list,List<List<Integer>> result){
        
        if(root == null){
            return;
        }
        
        list.add(new Integer(root.val));
        
        if(root.left == null && root.right == null && root.val == targetSum){
            result.add(new LinkedList(list));
            list.remove(list.size()-1);
            return;
        }else{
            pathSuminBT(root.left,targetSum-root.val,list,result);
            pathSuminBT(root.right,targetSum-root.val,list,result);
        }
        list.remove(list.size()-1);
    }
    
    //
}