package Day20191102;

import static BaseUtil.ArrayUtil.soutArray;

/**
 * @Auth:yqy
 * @Date 2019/11/2 15:04
 */
public class MaoPao {
    /**
     *  快速排序 时间复杂度为：O(N^2)，是稳定的
     * @param arr
     * @return
     */
    public static int[] doMaoPao(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] array={9,5,2,7,6,9};
        soutArray(doMaoPao(array));
    }
}
