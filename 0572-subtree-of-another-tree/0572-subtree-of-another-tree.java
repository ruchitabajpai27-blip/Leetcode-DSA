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
        return "null";
    }
    StringBuilder sb=new StringBuilder("^");
    sb.append(node.val);
    sb.append(preOrder(node.left));
    sb.append(preOrder(node.right));
return sb.toString();
}


}
