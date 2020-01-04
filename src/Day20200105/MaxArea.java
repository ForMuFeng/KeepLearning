package Day20200105;

/**
 * @author : yqy
 */
public class MaxArea {
    /**
     * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/container-with-most-water
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public int maxArea(int[] height) {
        int max=0;
        for(int i=0;i<height.length-1;i++){
            for(int j=i;j<height.length;j++){
                if(Math.min(height[i],height[j])*(j-i)>max){
                    max=Math.min(height[i],height[j])*(j-i);
                }
            }
        }
        return max;
    }

    //双指针法
    public int maxArea1(int[] height) {
       int max=0;
       int start=0;
       int end=height.length-1;
       while(start<end){
           max=Math.max(max,Math.min(height[start],height[end])*(end-start));
           if (height[start] > height[end]) {
               start++;
           } else {
               end--;
           }
       }
       return max;
    }
}
