package putongshuzu;

// 最大子数组和
//https://leetcode.cn/problems/maximum-subarray/
//普通数组

/**给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
子数组是数组中的一个连续部分。

示例 1：
输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
输出：6
解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。

示例 2：
输入：nums = [1]
输出：1
示例 3：

输入：nums = [5,4,-1,7,8]
输出：23*/

public class T3 {
        public int maxSubArray(int[] nums) {
            int max = nums[0];  // 修正：使用第一个元素作为初始值
            int sum = 0;

            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                max = Math.max(max, sum);  // 更新最大值

                if (sum < 0) {  // 如果当前和为负，则重置
                    sum = 0;
                }
            }

            return max;
        }
    }


// 这是Kadane算法的实现，用于寻找数组中连续子数组的最大和

/*public class putongshuzu.T3 {
    public int maxSubArray(int[] nums) {
        // 初始化最大值为数组的第一个元素
        int maxSoFar = nums[0];
        // 当前子数组的和，也从第一个元素开始
        int currentSum = nums[0];

        // 从第二个元素开始遍历数组
        for (int i = 1; i < nums.length; i++) {
            // 决定是继续扩展当前子数组还是从当前元素重新开始
            // 如果之前的累积和为负，那么加上它只会让总和变小
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            
            // 更新全局最大值
            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        return maxSoFar; // 返回找到的最大子数组和
    }
}*/


