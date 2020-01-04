package Day20191110;

import BaseUtil.TreeNode;

import java.util.Stack;

import static BaseUtil.ArrayUtil.TEST_ARRAY;

/**
 * @Auth:yqy
 * @Date 2019/11/10 11:50
 */
public class NonRecursiveTreeTravel {
    /**
     * 先序遍历
     * 3 1 7 5 9 22
     * 中序遍历
     * 1 3 5 7 9 22
     * 后续遍历
     * 1 5 22 9 7 3
     */

    public static void main(String[] args) {
        TreeNode t=TreeNode.initTreeByInts(TEST_ARRAY);
        System.out.println("先序遍历");
        preTravel(t);
        System.out.println("\n中序遍历");
        minTravel(t);
        System.out.println("\n后续遍历");
        lrd(t);
    }

    private static void preTravel(TreeNode treeNode){
        Stack<TreeNode> stack=new Stack<>();
        stack.push(treeNode);
        while(!stack.empty()){
            TreeNode t=stack.pop();
            System.out.print(t.val+" ");

            if(t.right!=null){
                stack.push(t.right);
            }

            if(t.left!=null){
                stack.push(t.left);
            }
        }
    }

    private static void minTravel(TreeNode treeNode){
        Stack<TreeNode> stack=new Stack<>();
        while(!stack.empty()||treeNode!=null){
            if(treeNode!=null){
                stack.push(treeNode);
                treeNode=treeNode.left;
            }else{
               treeNode= stack.pop();
                System.out.print(treeNode.val+" ");
                treeNode=treeNode.right;
            }
        }
    }

    private static void lrd(TreeNode treeNode){
        Stack<TreeNode> preStack=new Stack<>();
        Stack<TreeNode> resultStack=new Stack<>();
        preStack.push(treeNode);
        while(!preStack.empty()){
            TreeNode t=preStack.pop();
            resultStack.push(t);

            if(t.left!=null){
                preStack.push(t.left);
            }
            if(t.right!=null){
                preStack.push(t.right);
            }

        }
        while(!resultStack.empty()){
            System.out.print(resultStack.pop().val+" ");
        }
    }



}
