package Day20191105;

import static BaseUtil.ArrayUtil.soutArray;

/**
 * @Auth:yqy
 * @Date 2019/11/5 12:40
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array={8,3,9,5,0};
        doSort(array,0,array.length-1);
        soutArray(array);
    }



    public static int[] doSort(int[] arr,int left,int right){
        if(right>left){
            int i=sort(arr, left, right);
            sort(arr,left,i-1);
            sort(arr,i+1,right);
        }
        return arr;
    }
    public static int sort(int[] arr,int left,int right){
        int base=left;

        while(right>left){
            while(right>left&&arr[right]>arr[base]){
                right--;
            }

            if(arr[base]>arr[right]){
               int temp=arr[right];
               arr[right]=arr[base];
               arr[base]=temp;
               base=right;
            }
            while(right>left&&arr[left]<arr[base]){
                left++;
            }
            if(arr[base]<arr[left]&&right>left){
                int temp=arr[base];
                arr[base]=arr[left];
                arr[left]=temp;
                base=left;
            }
        }
        return base;
    }
 }
