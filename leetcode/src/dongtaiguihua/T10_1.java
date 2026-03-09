package dongtaiguihua;

import java.util.ArrayList;
import java.util.List;

//递归失败了需要用更快的算法{苦笑}
public class T10_1 {
    public static int climbStairs(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        for (int i = 0; i < n; i++) {
            list.add(list.get(i) + list.get(i + 1));
        }
        return list.get(n-1);
    }
}
