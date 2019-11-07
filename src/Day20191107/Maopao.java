package Day20191107;

import static BaseUtil.ArrayUtil.TEST_ARRAY;
import static BaseUtil.ArrayUtil.soutArray;

/**
 * @Auth:yqy
 * @Date 2019/11/7 20:20
 */
public class Maopao {
    public static void main(String[] args) {
        doMaoPao(TEST_ARRAY);
        soutArray(TEST_ARRAY);
    }

    public static void doMaoPao(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
