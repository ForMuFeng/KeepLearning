package Day20191111;

import java.util.HashSet;
import java.util.Stack;

/**
 * @Auth:yqy
 * @Date 2019/11/11 14:18
 */
public class MyTree {
    public TreeNode parent;

    public MyTree(TreeNode parent) {
        this.parent = parent;
        vals=new HashSet<>();
        vals.add(parent.getVal());
    }

    //使用set保证唯一
    private HashSet<Integer> vals;


    //寻找值为val的节点
    private TreeNode travelTree(TreeNode node,int val){
        Stack<TreeNode> stack=new Stack<>();
        if(node!=null){
            stack.push(node);
            while(!stack.empty()){
                TreeNode t=stack.pop();
                if(t.getVal()==val){
                    return t;
                }else{
                    for(TreeNode ts:t.getSons()){
                        stack.push(ts);
                    }
                }
            }
        }
        return null;
    }

    //遍历树，返回有子节点值为val的父节点
    private TreeNode travelToParentTree(TreeNode node,int val){
         synchronized (this){
             if(node!=null){
                 if(node.getSons().size()>0){
                     for(TreeNode treeNode:node.getSons()){
                         if(treeNode.getVal()==val){
                             return node;
                         }else{
                             TreeNode result=travelToParentTree(treeNode,val);
                             if(result!=null){
                                 return result;
                             }
                         }
                     }
                 }
             }
             return null;
         }
    }



    //添加
    boolean add(int pVal, int cVal) {
        synchronized (this){
            if(!vals.contains(pVal)||vals.contains(cVal)){
                //不存在父节点,或要添加值已存在
                return false;
            }
            TreeNode t=travelTree(this.parent,pVal);
            if(t!=null){
                t.getSons().add(new TreeNode(cVal));
                vals.add(cVal);
                return true;
            }else{
                return false;
            }
        }
    }


    //删除
    boolean del(int cVal) {
        TreeNode node=travelToParentTree(this.parent,cVal);
        if(node!=null){
            for(TreeNode treeNode:node.getSons()){
                if(treeNode.getVal()==cVal){
                    node.getSons().addAll(treeNode.getSons());
                    vals.remove(cVal);
                    node.getSons().remove(treeNode);
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        TreeNode node=new TreeNode(10);
        MyTree tree=new MyTree(node);
        System.out.println(tree.add(10,3));
        System.out.println(tree.add(3,6));
        System.out.println(tree.add(3,9));
        System.out.println(tree.add(3,12));
        System.out.println(tree.add(11,4));
        System.out.println(tree.del(4));
        System.out.println(tree.del(5));
        System.out.println();
    }


}
