package before20191101;

/**
 * @Auth:yqy
 * @Date 2019/10/11 21:14
 * 我是一名赌徒
 */
public class IAmAGambler {
    public int maxSubArray(int[] nums) {
        int max =0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<=0){
                sum=nums[i];
            }else{
                sum =nums[i]+sum;
            }
            max=Math.max(sum,max);
        }
        return max;
    }
}
