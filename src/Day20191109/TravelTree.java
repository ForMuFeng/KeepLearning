package Day20191109;

import BaseUtil.TreeNode;

import static BaseUtil.ArrayUtil.TEST_ARRAY;

/**
 * @Auth:yqy
 * @Date 2019/11/9 17:07
 */
public class TravelTree {

    //对二叉树进行遍历


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

    public static void main(String[] args) {
        TreeNode t=TreeNode.initTreeByInts(TEST_ARRAY);
        preTravel(t);
    }

}
