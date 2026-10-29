class Solution 
{
public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
{
List<List<Integer>> result = new ArrayList<>();


    if (root == null) 
    {
        return result;
    }

    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    boolean leftToRight = true;

    while (!q.isEmpty()) 
    {

        int size = q.size();
        List<Integer> level = new ArrayList<>();
        Stack<Integer>stack=new Stack<>();

        for (int i = 0; i < size; i++) 
        {
            TreeNode node = q.poll();
            if(leftToRight)
            level.add(node.val);
            else
            {
                stack.push((node.val));
            }

            if (node.left != null) 
            {
                q.add(node.left);
            }

            if (node.right != null) 
            {
                q.add(node.right);
            }
        }

        while(!stack.isEmpty()) 
        {
            level.add(stack.pop());
        }

        result.add(level);
        leftToRight = !leftToRight;
    }

    return result;
}
}
