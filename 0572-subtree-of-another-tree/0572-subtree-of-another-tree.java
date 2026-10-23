import java.util.*;
class Solution 
{
    public boolean isSubtree(TreeNode root, TreeNode subRoot) 
    {
    String tree = preOrder(root);
    String subTree = preOrder(subRoot);
    return tree.contains(subTree);
    }
public String preOrder(TreeNode node) 
   {
    if (node == null) 
    {
        return "#";
    }

    return "," + node.val
            + preOrder(node.left)
            + preOrder(node.right);
    }


}
