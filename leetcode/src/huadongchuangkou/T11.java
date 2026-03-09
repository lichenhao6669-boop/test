package huadongchuangkou;

//无重复字符的最长子串
//https://leetcode.cn/problems/longest-substring-without-repeating-characters/
//滑动窗口

import java.util.ArrayList;
import java.util.List;

/**示例 1:

输入: s = "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。注意 "bca" 和 "cab" 也是正确答案。
示例 2:

输入: s = "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:

输入: s = "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。*/
public class T11 {
    public int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            //如果集合中已包含了该字符，则从集合中删除该字符及之前的全部字符
            while (list.contains(s.charAt(i))) {
                list.remove(0);
            }
            list.add(s.charAt(i));
            //每次添加字符串，就重新判断最大长度
            max = Math.max(max, list.size());
        }
        return max;
    }
}
