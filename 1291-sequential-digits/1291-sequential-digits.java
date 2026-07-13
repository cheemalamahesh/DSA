import java.util.*;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        String num = "123456789";

        for (int len = 2; len <= num.length(); len++) {
            for (int s = 0; s <= num.length() - len; s++) {
                String sub = num.substring(s, s + len);
                int a = Integer.parseInt(sub);

                if (a >= low && a <= high) {
                    ans.add(a);
                }
            }
        }

        return ans;
    }
}