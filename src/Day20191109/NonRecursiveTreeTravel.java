package Day20191109;

import BaseUtil.TreeNode;

import java.util.Stack;

import static BaseUtil.ArrayUtil.TEST_ARRAY;

/**
 * @Auth:yqy
 * @Date 2019/11/9 19:23
 */
public class NonRecursiveTreeTravel {
    //二叉树遍历使用非递归遍历时使用栈实现

    /**
     * 先序遍历
     * 3 1 7 5 9 22
     * 中序遍历
     * 1 3 5 7 9 22
     * 后续遍历
     * 1 5 22 9 7 3
     */



    //先序遍历
    public static void preTravel(TreeNode treeNode){
        Stack<TreeNode> stack=new Stack<>();
        stack.push(treeNode);
        while(!stack.empty()){
            TreeNode t=stack.pop();


            if(t.right!=null){
                stack.push(t.right);
            }
            System.out.print(t.val+" ");
            if(t.left!=null){
                stack.push(t.left);
            }
        }
    }

    //中序遍历
    public static void midTravel(TreeNode node){
        Stack<TreeNode> stack=new Stack<>();
        while(!stack.empty()||node!=null){
            if(node!=null){
                stack.push(node);
                node=node.left;
            }else{
                node=stack.pop();
                System.out.print(node.val+" ");
                node=node.right;
            }
        }
    }

    public static void main(String[] args) {
        TreeNode t=TreeNode.initTreeByInts(TEST_ARRAY);
        System.out.println("\n先序遍历");
        preTravel(t);
        System.out.println("\n中序遍历");
        midTravel(t);


    }
}
