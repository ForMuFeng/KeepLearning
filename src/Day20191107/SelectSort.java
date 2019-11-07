package Day20191107;

import static BaseUtil.ArrayUtil.TEST_ARRAY;
import static BaseUtil.ArrayUtil.soutArray;

/**
 * @Auth:yqy
 * @Date 2019/11/7 20:27
 */
public class SelectSort {
    //选择排序，从头至尾扫描序列，找出最小的一个元素，和第一个元素交换，接着从剩下的元素中继续这种选择和交换方式，最终得到一个有序序列。
    public static void doSelectSort(int[] arr){
        int flag=0;
        int min;
        for(int i=0;i<arr.length;i++){
            min=arr[flag];
            for(int j=flag;j<arr.length;j++){
                if(arr[j]<min){
                     min=arr[j];
                    arr[j]=arr[flag];
                    arr[flag]=min;
                }
            }
            flag++;
        }
    }

    public static void main(String[] args) {
        doSelectSort(TEST_ARRAY);
        soutArray(TEST_ARRAY);
    }
}
