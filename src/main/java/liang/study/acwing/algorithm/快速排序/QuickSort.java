package liang.study.acwing.algorithm.快速排序;

/**
 * @author: zhe.liang
 * @create: 2023-03-06 23:43
 **/
public class QuickSort {

    public static void main(String[] args) {
        int[] q = new int[]{3,1,5,6,7,8,9,1,2,3,6};
        quickSort(q,0,q.length-1);
        for (int i : q) {
            System.out.print(i + ",");
        }
    }

    public static void quickSort(int[] arr,int left,int right){
        if(left >= right){
            return;
        }
        int x = arr[left];
        int l = left - 1;
        int r = right + 1;

        while(l < r){
            do {
                l++;
            }while (arr[l] < x);
            do {
                r--;
            }while (arr[r] > x);
            if(l < r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
        quickSort(arr,left,r);
        quickSort(arr,r+1,right);
    }
}
