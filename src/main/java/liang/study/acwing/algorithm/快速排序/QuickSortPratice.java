package liang.study.acwing.algorithm.快速排序;

/**
 * @author: zhe.liang
 * @create: 2023-02-08 13:23
 **/
public class QuickSortPratice {
    public static void main(String[] args) {
        int[] q = new int[]{3,1,5,6,7,8,9,1,2,3,6};
        quickSort(q,0,q.length-1);
        for (int i : q) {
            System.out.print(i + ",");
        }
    }

    private static void quickSort(int[] q, int l,int r){
        if(l >= r){
            return;
        }

        int x = q[l];
        int left = l - 1;
        int right = r + 1;

        while(left < right){
            do {
                left++;
            }while(q[left] < x);

            do{
                right --;
            }while (q[right] > x);

            if(left < right){
                swap(q,left,right);
            }
        }

        quickSort(q,l,right);
        quickSort(q,right + 1, r);
    }

    private static void swap(int[] q,int i,int j){
        int temp = q[i];
        q[i] = q[j];
        q[j] = temp;
    }
}
