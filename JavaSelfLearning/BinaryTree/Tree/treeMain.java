package JavaSelfLearning.BinaryTree.Tree;

public class treeMain {
    public static void main(String [] args){
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode Hot = new TreeNode("Hot");
        TreeNode Cold = new TreeNode("Drinks");
        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");
        TreeNode greenTea = new TreeNode("GreenTea");
        TreeNode blackTea = new TreeNode("blackTea");
        drinks.addChild(Hot);
        drinks.addChild(Cold);
        Hot.addChild(tea);
        Hot.addChild(coffee);
        tea.addChild(greenTea);
        tea.addChild(blackTea);
        System.out.println(drinks.print(0));
    }
}
