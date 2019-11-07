package Day20191107;

import java.util.ArrayList;

/**
 * @Auth:yqy
 * @Date 2019/11/7 19:14
 */
public class ShowOutOfMemeoryError {
    public static void main(String[] args) {
        //java.lang.OutOfMemoryError: Java heap space
        //一直申请内存但是不释放对象 堆内存就会溢出（对象会存放在堆中）
        ArrayList<String> arr=new ArrayList<>();
        while(true){
            arr.add("a");
        }
    }
}
