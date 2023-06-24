package liang.study.acwing.algorithm.归并排序;

/**
 * @author: zhe.liang
 * @create: 2023-03-21 23:46
 **/
public class MergeSortPratice {

    private static int[] temp;
    public static void main(String[] args) {
        int[] test = new int[]{1,2};
        temp = new int[test.length];

    }

    private void mergeSort(int[] q ,int l ,int r){
        if(l >= r){
            return;
        }

        int mid = (l + r)/2;

        mergeSort(q ,l ,mid);
        mergeSort(q , mid+1 ,r);

        int i = l;
        int j = mid + 1;
        int tempPtr = 0;

        while(i <= mid && j <= r){
            if(q[i] <= q[j]){
                temp[tempPtr++] = q[i++];
            }
            if(q[i] > q[j]){
                temp[tempPtr++] = q[j++];
            }
        }

        while(i <= mid){
            temp[tempPtr++] = q[i++];
        }

        while(j <= r){
            temp[tempPtr++] = q[j++];
        }
        int a = 0;
        for(int p = l ; p <= r ; p++){
            q[p] = temp[a++];
        }




    }
}
