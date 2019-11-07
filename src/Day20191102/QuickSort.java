package Day20191102;

import static BaseUtil.ArrayUtil.soutArray;

/**
 * @Auth:yqy
 * @Date 2019/11/2 14:32
 */
public class QuickSort {
    /**
     *   今日份快速排序
     *
     * 最优的情况下空间复杂度为：O(logN)
     *
     * 最差的情况下空间复杂度为：O(N^2)
     *
     * 快速排序的平均时间复杂度是：O(N*logN)
     */


    public static void main(String[] args) {
        int[] a={3,2};
        doSort(a,0,a.length-1);
        soutArray(a);

    }

    public static int[] doSort(int[] arr,int left,int right){
        int i=sort(arr,left,right);
        if(left<right){
            doSort(arr,left,i-1);
            doSort(arr,i+1,right);
        }
        return arr;
    }


    public static int sort(int[] arr,int left,int right){
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
        return base;

    }
}
