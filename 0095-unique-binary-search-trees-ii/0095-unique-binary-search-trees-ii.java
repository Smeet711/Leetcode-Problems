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
    public List<TreeNode> generateTrees(int n) {
        return constructBST(1,n);
        
    }
    
    //
    public List<TreeNode> constructBST(int start,int end){
        
        if(start > end){
            List<TreeNode> base = new ArrayList<>();
            base.add(null);
            return base;
        }
        
        
        List<TreeNode> result = new ArrayList<>();
        
        for(int i=start;i<=end;i++){
            List<TreeNode> leftSubtree = constructBST(start,i-1);
            List<TreeNode> rightSubtree = constructBST(i+1,end);
           
            for(TreeNode l :leftSubtree){
                for(TreeNode r : rightSubtree){
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    result.add(root);
                }
            }
        }
        
        return result;
        
    }
    //
    //
}