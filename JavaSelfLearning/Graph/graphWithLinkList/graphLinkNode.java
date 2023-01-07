package JavaSelfLearning.Graph.graphWithLinkList;

import java.util.ArrayList;

public class graphLinkNode {
    public String name;
    public int index;
    public ArrayList<graphLinkNode> neighbors = new ArrayList<>();

    public graphLinkNode(String name, int index){
        this.name = name;
        this.index = index;
    }
}
