package BaseUtil;

/**
 * @Auth:yqy
 * @Date 2019/11/9 17:08
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }

    //如果使用默认的TEST_ARRAY 那么得到的树结构为
    //3,1,7,9,5,22


    /**
     *           3
     *      1         7
     *              5   9
     *                    22
     *
     */


    public static TreeNode initTreeByInts(int[] arr){
        TreeNode t=new TreeNode(arr[0]);
        for(int i=1;i<arr.length;i++){
            doInitTree(t,arr[i]);
        }

        return t;
    }

    private static void doInitTree(TreeNode t,int x){
        if(x>t.val){
            if(t.right==null){
                t.right=new TreeNode(x);
            }else{
                doInitTree(t.right,x);
            }

        }else if(x<t.val){
            if(t.left==null){
                t.left=new TreeNode(x);
            }else{
                doInitTree(t.left,x);
            }
        }else{
            throw new RuntimeException("Invalid val");
        }
    }
}