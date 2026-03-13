package huadongchuangkou;

//找到字符串中所有字母异位词
//https://leetcode.cn/problems/find-all-anagrams-in-a-string/
//滑动窗口

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
示例 1:
输入: s = "cbaebabacd", p = "abc"
输出: [0,6]
解释:
起始索引等于 0 的子串是 "cba", 它是 "abc" 的异位词。
起始索引等于 6 的子串是 "bac", 它是 "abc" 的异位词。

示例 2:
输入: s = "abab", p = "ab"
输出: [0,1,2]
解释:
起始索引等于 0 的子串是 "ab", 它是 "ab" 的异位词。
起始索引等于 1 的子串是 "ba", 它是 "ab" 的异位词。
起始索引等于 2 的子串是 "ab", 它是 "ab" 的异位词。*/


public class T19 {
    public List<Integer> findAnagrams(String s, String p) {
          List<Integer> res = new ArrayList<>();
          int n = s.length();
          int m = p.length();
          if (n < m) {
              return res;
          }
          int[] cnt1 = new int[26];
          int[] cnt2 = new int[26];
          for (int i=0; i<m; i++){
            cnt2[p.charAt(i) - 'a']++;
         }
          for (int i=0; i<n; i++){
            cnt1[s.charAt(i) - 'a']++;
            if (i>=m){
                cnt1[s.charAt(i-m) - 'a']--;
            }
              if (i>=m-1){
                if (Arrays.equals(cnt1, cnt2)) {
                    res.add(i-m+1);
                }
            }
         }
          return res;
    }
}
