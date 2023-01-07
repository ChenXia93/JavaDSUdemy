package JavaSelfLearning.Graph.graphWithLinkList;

import java.util.ArrayList;

public class graphMain {
    public static void main(String [] args){
        ArrayList<graphLinkNode> nodeList = new ArrayList<>();
        nodeList.add(new graphLinkNode("A", 0));
        nodeList.add(new graphLinkNode("B", 1));
        nodeList.add(new graphLinkNode("C", 2));
        nodeList.add(new graphLinkNode("D", 3));
        nodeList.add(new graphLinkNode("E", 4));


        graphLinkClass graph =  new graphLinkClass(nodeList);
        graph.addUndirectedEdge(0, 1);
        graph.addUndirectedEdge(0, 2);
        graph.addUndirectedEdge(0, 3);
        graph.addUndirectedEdge(1, 4);
        graph.addUndirectedEdge(2, 3);
        graph.addUndirectedEdge(3, 4);

    }
}
