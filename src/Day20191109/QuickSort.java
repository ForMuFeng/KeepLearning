package Day20191109;

import static BaseUtil.ArrayUtil.TEST_ARRAY;
import static BaseUtil.ArrayUtil.soutArray;

/**
 * @Auth:yqy
 * @Date 2019/11/9 16:08
 */
public class QuickSort {
    public static void doSort(int[] arr,int left,int right){
        int start=left;
        int end=right;

        int base=left;
        while(right>left){
            while(right>left&&arr[right]>=arr[base]){
                right--;
            }
            if(arr[right]<arr[base]){
                int temp=arr[base];
                arr[base]=arr[right];
                arr[right]=temp;
                base=right;
            }
            while(right>left&&arr[left]<=arr[base]){
                left++;
            }
            if(arr[base]<arr[left]){
                int temp=arr[base];
                arr[base]=arr[left];
                arr[left]=temp;
                base=left;
            }
        }

        if(start<end){
            doSort(arr,base+1,end);
            doSort(arr,start,base-1);
        }
    }

    public static void main(String[] args) {
        doSort(TEST_ARRAY,0,TEST_ARRAY.length-1);
        soutArray(TEST_ARRAY);
    }
}
