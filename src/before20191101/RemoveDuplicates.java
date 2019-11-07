package before20191101;

/**
 * @Auth:yqy
 * @Date 2019/10/11 14:57
 */
public class RemoveDuplicates {

    /**
     * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]>=nums[i+1]){
                    if(i+2==nums.length){
                        return i+1;
                    }
                    for(int j=i+2;j<nums.length;j++){
                        if(nums[j]!=nums[i]&&nums[j]>nums[i]){
                            nums[i+1]=nums[j];
                            break;
                        }
                        if(j==nums.length-1){
                            return i+1;
                        }

                    }
                }
            }
            return nums.length;
    }

    public static void main(String[] args) {
        int a[] ={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(a));
        show(a);
    }


    private static void show(int[] num){
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println("");
    }
}
