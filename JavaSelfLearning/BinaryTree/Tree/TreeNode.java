package JavaSelfLearning.BinaryTree.Tree;
import java.util.ArrayList;
public class TreeNode {
    String data;
    ArrayList<TreeNode> children;

    public TreeNode(String data){
        this.data = data;
        this.children = new ArrayList<TreeNode>();
    }

    public void addChild(TreeNode node){
        this.children.add(node);
    }

    public String print(int lvl){
        String returnValue;
        returnValue = " ".repeat(lvl) + data + "\n";
        for(TreeNode node: this.children){
            returnValue += node.print(lvl+ 1);
        }
        return returnValue;
    }
}
