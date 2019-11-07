package Day20191107;

/**
 * @Auth:yqy
 * @Date 2019/11/7 19:13
 */
public class ShowStackOverFlowError {
    public static void main(String[] args) {
        //没有终止条件的调用递归方法导致虚拟机栈溢出
        ShowStackOverFlowError s=new ShowStackOverFlowError();
        s.doDiGui();
    }

    public void doDiGui(){
        doDiGui();
    }
}
