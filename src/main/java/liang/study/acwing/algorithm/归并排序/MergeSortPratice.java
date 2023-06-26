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
        int mid = (l + r) / 2;
        mergeSort(q,l,mid);
        mergeSort(q,mid + 1,r);

        int[] temp = new int[q.length];
        int left = l;
        int right = mid+1;
        int point = 0;
        while(left <= mid && right <= r){
            if(q[left] < q[right]){
                temp[point++] = q[left++];
            }else {
                temp[point++] = q[right++];
            }
        }

        while (left <= mid){
            temp[point++] = q[left++];
        }

        while(right <= r){
            temp[point++] = q[right++];
        }

        int fuck = 0;
        for (int a = l ; a <= r ; a++){
            q[a] = temp[fuck++];
        }



    }
}
