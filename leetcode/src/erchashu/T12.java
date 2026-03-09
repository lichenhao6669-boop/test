package erchashu;

//二叉树的中序遍历
//https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
//二叉树

import java.util.ArrayList;
import java.util.List;

/**给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。

示例 1

输入：root = [1,null,2,3]
输出：[1,3,2]
示例 2：

输入：root = []
输出：[]
示例 3：

输入：root = [1]
输出：[1]*/
//递归算法
public class T12 {
    public List<Integer> inorderTraversal(TreeNode root) {
          List<Integer> list = new ArrayList<>();
          inorder(root,list);
          return list;
    }
    public static void inorder(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
}
//迭代算法
/**
 * public class T12 {
 *     public List<Integer> inorderTraversal(TreeNode root) {
 *         List<Integer> list = new ArrayList<>();
 *         Deque<TreeNode> stack = new LinkedList<>();
 *         while (root != null || !stack.isEmpty()) {
 *             while (root != null) {
 *                 stack.push(root);
 *                 root = root.left;
 *             }
 *             root = stack.pop();
 *             list.add(root.val);
 *             root = root.right;
 *         }
 *         return list;
 *     }
 * }
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
*/