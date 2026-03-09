package shuangzhizhen;


//移动零
//https://leetcode.cn/problems/move-zeroes/
//双指针

/**给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
请注意 ，必须在不复制数组的情况下原地对数组进行操作。

示例 1:
输入: nums = [0,1,0,3,12]
输出: [1,3,12,0,0]

示例 2:
输入: nums = [0]
输出: [0]*/
public class T1 {
    public static void moveZeroes(int[] nums) {
        int i=0;
        int sum=0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]==0){
                sum++;
            }
        }
        if (sum==0){
            return;
        }
        if (nums==null||nums.length==0||nums.length==1){
            return;
        }
        while (i<nums.length){
            int j=i+1;
            while (j<nums.length&&nums[j]==0){
                j++;
            }
            if (j<nums.length&&nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            else {
                i++;
            }
        }
    }
}
