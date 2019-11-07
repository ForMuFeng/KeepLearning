package Day20191107;

import static BaseUtil.ArrayUtil.TEST_ARRAY;
import static BaseUtil.ArrayUtil.soutArray;

/**
 * @Auth:yqy
 * @Date 2019/11/7 20:02
 */
public class QuickSort {

    public static void main(String[] args) {
        doSort(TEST_ARRAY,0,TEST_ARRAY.length-1);
        soutArray(TEST_ARRAY);
    }
    public static void doSort(int[] arr,int left,int right){
        int start=left;
        int end=right;
        int base=left;
        while(right>left){
            while(arr[right]>=arr[base]&&right>left){
                right--;
            }
            if(arr[right]<arr[base]){
                int temp=arr[base];
                arr[base]=arr[right];
                arr[right]=temp;
                base=right;
            }
            while(arr[left]<=arr[base]&&right>left){
                left++;
            }
            if(arr[base]<arr[left]){
                int temp=arr[base];
                arr[base]=arr[left];
                arr[left]=temp;
                base=left;
            }
        }
        if(end>start){
            doSort(arr,start,base-1);
            doSort(arr,base+1,end);
        }
    }
}
