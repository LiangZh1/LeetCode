package liang.study.leetcode.数组_链表_跳表;

public class _283_移动零 {


    class Solution {
        public void moveZeroes(int[] nums) {
            int len = nums.length;
            if (len == 0) {
                return;
            }
            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[j] = nums[i];
                    if (i != j) {
                        nums[i] = 0;
                    }
                    j++;
                }
            }
        }
    }
}
