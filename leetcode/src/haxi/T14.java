package haxi;

//最长连续序列
//https://leetcode-cn.com/problems/longest-consecutive-sequence/
//哈希

import java.util.Arrays;

/**给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。

请你设计并实现时间复杂度为 O(n) 的算法解决此问题。



示例 1：

输入：nums = [100,4,200,1,3,2]
输出：4
解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
示例 2：

输入：nums = [0,3,7,2,5,8,4,6,0,1]
输出：9
示例 3：

输入：nums = [1,0,1,2]
输出：3*/

public class T14 {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int res = 1;
        int max=1;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] + 1){
                res=res+1;
                max=Math.max(max,res);
            }else if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }else {
                res = 1;
            }
        }
        return max;
    }
}
