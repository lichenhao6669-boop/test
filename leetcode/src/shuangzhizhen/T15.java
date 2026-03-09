package shuangzhizhen;

//接雨水
//https://leetcode-cn.com/problems/trapping-rain-water/
//双指针

/**给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。

示例 1：

输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
输出：6
解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。
示例 2：

输入：height = [4,2,0,3,2,5]
输出：9*/
public class T15 {
    public int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;  // 记录从左向右遍历过程中的最大高度
        int rightMax = 0; // 记录从右向左遍历过程中的最大高度
        int sum = 0;

        while (left < right) {
            // 实时更新左右两侧遇到的最大值
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            // 核心策略：哪边低，就先处理哪边
            // 原理：如果 height[left] < height[right]，说明左边是当前短板。
            // 此时可以确定 leftMax <= rightMax，所以当前位置的水位由 leftMax 决定。
            if (height[left] < height[right]) {
                sum += leftMax - height[left];
                left++;
            } else {
                // 反之，右边是短板，水位由 rightMax 决定
                sum += rightMax - height[right];
                right--;
            }
        }

        return sum;
    }

}
