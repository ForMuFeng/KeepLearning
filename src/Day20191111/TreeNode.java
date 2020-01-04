package Day20191111;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auth:yqy
 * @Date 2019/11/11 13:59
 */
public class TreeNode {


    private int val;
    private List<TreeNode> sons;


    public TreeNode(int val) {
        this.val = val;
        sons=new ArrayList<>();
    }


    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public List<TreeNode> getSons() {
        return sons;
    }

    public void setSons(List<TreeNode> sons) {
        this.sons = sons;
    }
}
