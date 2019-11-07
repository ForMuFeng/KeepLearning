package Day20191102;

import java.util.Arrays;

/**
 * @Auth:yqy
 * @Date 2019/11/2 15:23
 */
public class StringDemo {
    public static void main(String[] args) {
        int[] a={1,3,5,6};
        Long max=Arrays.stream(a).asLongStream().max().getAsLong();
        System.out.println(max);
    }
}
