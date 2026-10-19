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
class Solution 
{
    public boolean isSymmetric(TreeNode root) 
    {
        if(root==null)
        {
            return true;
        }
        Queue<TreeNode>left=new LinkedList<>();
        Queue<TreeNode>right=new LinkedList<>();
        left.add(root.left);
        right.add(root.right);
        while(!left.isEmpty()&&!right.isEmpty())
        {
            TreeNode leftNode=left.poll();
            TreeNode rightNode=right.poll();
            
            if(leftNode==null && rightNode==null)
            {
                continue;
            }
            if(leftNode==null || rightNode==null)
            {
                return false;
            }
            if(leftNode.val!=rightNode.val)
            {
                return false;
            }

            left.add(leftNode.left);
            left.add(leftNode.right);
            right.add(rightNode.right);
            right.add(rightNode.left);
        }
    return true;
    }
}