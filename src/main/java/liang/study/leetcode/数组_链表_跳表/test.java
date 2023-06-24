package liang.study.leetcode.数组_链表_跳表;

/**
 * @author: zhe.liang
 * @create: 2023-03-20 15:29
 **/
public class test {

    public static void main(String[] args) {
        int[] nums = {-9, 2 ,3 ,-3 , -11,-4};
        sort2(nums);
        for (int num : nums) {
            System.out.print(num + ", ");
        }
    }

    public static void sort(int[] nums){
        int i = -1;
        int j = -1;
        for(int k = 0 ; k < nums.length ; k ++){
            if (nums[k] > 0) {
                i = k;
                j = k;
                break;
            }
        }
        if(i == -1){
            return;
        }


        while(j < nums.length){
            if(nums[j] < 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i ++;
            }
            j++;
        }

    }

    public static void sort2(int[] arr){
        int j = 0;
        int i, k, tmp;
        for(i = 0; i < arr.length; i++) {
            //1.找到第一个负数  j始终指向第一个正数
            if (arr[i] < 0) {
                tmp = arr[i];
                for(k = i; k > j; k--){
                    arr[k] = arr[k - 1];
                }
                arr[j++] = tmp;
            }
        }
    }
}
