package Day20191101;

/**
 * @Auth:yqy
 * @Date 2019/11/01 18:20
 */
public class QuickSort {
    /**
     * 快速排序
     *
     * 最优时间复杂度：快速排序最优的情况下时间复杂度为：O( nlogn )
     * 最差时间复杂度：O( n^2 ) 此时等同于冒泡排序
     */
    public static void main(String[] args) {
        int[] array={3,2};
        doSort(array,0,array.length-1);
    }
    public static void doSort(int[] arr,int left,int right){
        if(right>left){
            int index=sort(arr,left,right);
            doSort(arr,left,index-1);
            doSort(arr,index+1,right);
        }
    }
    public static int sort(int[] arr,int left,int right){

        int base=left;
        while(right>left){
            while(arr[right]>=arr[base]&&right>left){
                right--;
            }
            if(arr[right]<arr[base]){
                int temp=arr[right];
                arr[right]=arr[base];
                arr[base]=temp;
                base=right;
            }
            while(arr[left]<=arr[base]&&right>left){
                left++;
            }
            if(arr[left]>arr[base]){
                int temp=arr[left];
                arr[left]=arr[base];
                arr[base]=temp;
                base=left;
            }
        }
        show(arr);
        return base;
    }

    public static void show(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
