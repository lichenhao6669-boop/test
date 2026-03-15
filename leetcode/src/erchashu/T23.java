package erchashu;

//二叉树的直径
//https://leetcode-cn.com/problems/diameter-of-binary-tree/
//二叉树


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**给你一棵二叉树的根节点，返回该树的 直径 。
二叉树的 直径 是指树中任意两个节点之间最长路径的 长度 。这条路径可能经过也可能不经过根节点 root 。
两节点之间路径的 长度 由它们之间边数表示。

示例 1：
输入：root = [1,2,3,4,5]
输出：3
解释：3 ，取路径 [4,2,1,3] 或 [5,2,1,3] 的长度。

示例 2：
输入：root = [1,2]
输出：1*/

public class T23 {
    // 用于记录最大直径
    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 重置全局变量，防止多次调用受影响
        maxDiameter = 0;
        calculateDepth(root);
        return maxDiameter;
    }

    /**
     * 计算以 node 为根节点的树的最大深度
     * 同时在过程中更新最大直径
     */
    private int calculateDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // 递归计算左右子树的深度
        int leftDepth = calculateDepth(node.left);
        int rightDepth = calculateDepth(node.right);

        // 关键步骤：当前节点的直径 = 左深度 + 右深度
        // 更新全局最大直径
        maxDiameter = Math.max(maxDiameter, leftDepth + rightDepth);

        // 返回当前节点的最大深度给父节点使用
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
