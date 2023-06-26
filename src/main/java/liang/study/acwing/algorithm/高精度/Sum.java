package liang.study.acwing.algorithm.高精度;

public class Sum {

    public static void main(String[] args) {
        //低位为个位
        int[] a = {1,2,3};
        int[] b = {9,9,9};
        int[] add = add(a, b);

        for (int i = add.length - 1; i >= 0; i--) {
            System.out.print(add[i]);
        }
    }

    //低位为个位，不然进位时需要移动整个数组
    private static int[] add(int[] a,int[] b){
        int[] c = new int[Math.max(a.length,b.length) + 1];
        int t = 0;
        int pointer = 0;
        for(int i = 0 ; i < a.length || i < b.length ; i++){
            if(i < a.length){
                t += a[i];
            }
            if(i < b.length){
                t += b[i];
            }

            c[pointer++] = t % 10;
            t /= 10;
        }
        if(t != 0){
            c[pointer] = 1;
        }
        return c;

    }
}
