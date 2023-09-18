package liang.study.acwing.algorithm.归并排序;

/**
 * @author: zhe.liang
 * @create: 2023-03-08 00:20
 **/
public class MergeSort {

    public static void main(String[] args) {
        int[] q = new int[]{3,1,5,6,7,8,9,1,2,3,6};
        mergeSort(q,0,q.length-1);
        for (int i : q) {
            System.out.print(i + ",");
        }

    }

    public static void mergeSort(int[] q,int l,int r){
        if(l >= r){
            return;
        }
        int mid = (l + r) / 2;

        mergeSort(q,l,mid);
        mergeSort(q,mid + 1 , r);

        int i = l;
        int j = mid+1;
        int[] temp = new int[q.length];
        int temp_pointer = 0;

        while(i <= mid && j <= r){
            if(q[i] <= q[j]){
                temp[temp_pointer++] = q[i++];
            }else {
                temp[temp_pointer++] = q[j++];
            }
        }

        while(i <= mid){
            temp[temp_pointer++] = q[i++];
        }

        while(j <= r){
            temp[temp_pointer++] = q[j++];
        }
        int a= 0;
        for(int b = l ; b <= r ; b++){
            q[b] = temp[a++];
        }
    }
}
