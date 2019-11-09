package Day20191109;

import BaseUtil.TreeNode;

import static BaseUtil.ArrayUtil.TEST_ARRAY;

/**
 * @Auth:yqy
 * @Date 2019/11/9 17:07
 */
public class TravelTree {

    //对二叉树进行遍历
    //3,1,7,9,5,22

    //先序遍历 中 左 右
    public static void preTravel(TreeNode treeNode){
        System.out.print(treeNode.val+" ");

        if(treeNode.left!=null){
            preTravel(treeNode.left);
        }

        if(treeNode.right!=null){
            preTravel(treeNode.right);
        }
    }


    //中序遍历 左 中 右
    public static void midTravel(TreeNode treeNode){
        if(treeNode.left!=null){
            midTravel(treeNode.left);
        }
        System.out.print(treeNode.val+" ");
        if(treeNode.right!=null){
            midTravel(treeNode.right);
        }
    }


    //后序遍历 左 右 中
    public static void lrd(TreeNode treeNode){
        if(treeNode.left!=null){
            lrd(treeNode.left);
        }

        if(treeNode.right!=null){
            lrd(treeNode.right);
        }

        System.out.print(treeNode.val+" ");
    }

    public static void main(String[] args) {
        TreeNode t=TreeNode.initTreeByInts(TEST_ARRAY);
        System.out.println("先序遍历");
        preTravel(t);
        System.out.println();
        System.out.println("中序遍历");
        midTravel(t);
        System.out.println();
        System.out.println("后续遍历");
        lrd(t);
    }

}
