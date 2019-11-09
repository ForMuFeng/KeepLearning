package Day20191109;

import static BaseUtil.ArrayUtil.TEST_ARRAY;
import static BaseUtil.ArrayUtil.soutArray;

/**
 * @Auth:yqy
 * @Date 2019/11/9 16:15
 */
public class SelectSort {
    //选择排序
    public static void doSelectSort(int[] arr){
        int min;
        for(int i=0;i<arr.length;i++){
            min=arr[i];
            for(int j=i;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    arr[j]=arr[i];
                    arr[i]=min;
                }
            }
        }
    }

    public static void main(String[] args) {
        doSelectSort(TEST_ARRAY);
        soutArray(TEST_ARRAY);
    }
}

