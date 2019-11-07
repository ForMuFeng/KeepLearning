package Day20191101;

import java.util.ArrayList;

/**
 * @Auth:yqy
 * @Date 2019/11/1 19:21
 */
public class ArrayListimplementsQueue {
    ArrayList<Integer> arrayList;

    public ArrayListimplementsQueue() {
        this.arrayList = new ArrayList<>();
    }

    public void add(int i){
        arrayList.add(i);
    }

    public void out(){
        arrayList.remove(0);
    }


}
