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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // List<Integer> res1=new ArrayList<>();
        // List<Integer> res2=new ArrayList<>();
        //  dfs(res1,p);
        //  dfs(res2,q);
        // return res1.equals(res2); 

        if(p==null && q==null)
        {
            return true;
        }

        if(p==null || q==null || p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);



    }
    // public static void dfs(List<Integer> res, TreeNode root)
    // {
    //    if(root==null)
    //    {return;}

    //    dfs(res,root.left);
    //    res.add(root.val);
    //    dfs(res,root.right);

    // }
}

