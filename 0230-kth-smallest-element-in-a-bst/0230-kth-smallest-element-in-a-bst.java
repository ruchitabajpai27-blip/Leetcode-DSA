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
    int count = 0;
    int ans = 0;

    public int kthSmallest(TreeNode root, int k) 
    {
        inorder(root, k);  //CALLING HELPER METHOD
        return ans;
    }

    public void inorder(TreeNode root, int k)  //HELPER METHOD
    {
        if(root == null)
        {
            return;
        }

        inorder(root.left, k);  //VISITING LEFT SUBTREE

        count++;

        if(count == k)   //CONDITION TRUE ANS FOUND
        {
            ans = root.val;
            return;
        }

        inorder(root.right, k);  //OTHERWISE VISIT RIGHT SUBTREE
    }
}