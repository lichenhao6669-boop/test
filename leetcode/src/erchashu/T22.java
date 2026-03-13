package erchashu;

//对称二叉树
//https://leetcode.cn/problems/symmetric-tree/
//二叉树

/**给你一个二叉树的根节点 root ， 检查它是否轴对称。

示例 1：

输入：root = [1,2,2,3,4,4,3]
输出：true
示例 2：

输入：root = [1,2,2,null,3,null,3]
输出：false*/

public class T22 {
    public boolean isSymmetric(TreeNode root) {
        TreeNode root1 =root.right;
        TreeNode root2 =root.left;
        return is(root1,root2);
    }
    public boolean is(TreeNode root1, TreeNode root2) {
        if (root1==null&&root2==null){
            return true;
        }
        if (root1==null||root2==null){
            return false;
        }
        if (root1.val!=root2.val){
            return false;
        }
        boolean b = is(root1.left, root2.right);
        boolean b1 = is(root1.right, root2.left);
        return b&&b1;
    }
}
