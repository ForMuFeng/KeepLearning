package Day20191107;

import static BaseUtil.ArrayUtil.TEST_ARRAY;
import static BaseUtil.ArrayUtil.soutArray;

/**
 * @Auth:yqy
 * @Date 2019/11/7 21:43
 */
public class InsertSort {
    public static void doInsertSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    for(int a=i;a>j;a--){
                        arr[a]=arr[a-1];
                    }
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        doInsertSort(TEST_ARRAY);
        soutArray(TEST_ARRAY);
    }
}
