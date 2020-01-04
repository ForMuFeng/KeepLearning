package Day20191110;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Auth:yqy
 * @Date 2019/11/9 17:05
 */
public class IsSubtree {
    //给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/subtree-of-another-tree
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    private class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

      //先对树进行先序和中序遍历，如果先序和中序遍历中都有对应的相同子串，那么认为是含有这个子串的

    private static String preTravel(TreeNode t){
        Stack<TreeNode> stack=new Stack<>();
        stack.push(t);
        StringBuilder builder=new StringBuilder();
        while(!stack.empty()){
            TreeNode node=stack.pop();
            builder.append(node.val+" ");
            if(node.left!=null){
                stack.push(node.left);
            }
            if(node.right!=null){
                stack.push(node.right);
            }
        }
        return builder.toString();
    }

    private static String midTravel(TreeNode treeNode){
        StringBuilder builder=new StringBuilder();
        Stack<TreeNode> stack=new Stack<>();
        while (!stack.empty()||treeNode!=null){
            if(treeNode!=null){
                stack.push(treeNode);
                treeNode=treeNode.left;
            }else{
                treeNode=stack.pop();
                builder.append(treeNode.val+" ");
                treeNode=treeNode.right;
            }
        }
        return builder.toString();
    }

      public boolean isSubtree(TreeNode s, TreeNode t) {
        String preFather=preTravel(s);
        String preSon=preTravel(t);
        String midFather=midTravel(s);
        String midSon=midTravel(t);
          System.out.println(preFather);
          System.out.println(preSon);
          System.out.println(midFather);
          System.out.println(midSon);
        if(preFather.contains(preSon)&&midFather.contains(midSon)){
            return true;
        }else{
            return false;
        }
    }



}
