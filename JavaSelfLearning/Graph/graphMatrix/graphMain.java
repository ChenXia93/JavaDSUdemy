package JavaSelfLearning.Graph.graphMatrix;

import java.util.ArrayList;

public class graphMain {
    public static void main(String [] args){
        ArrayList<graphNode> nodeList = new ArrayList<>();
        nodeList.add(new graphNode("A", 0 ));
        nodeList.add(new graphNode("B", 1 ));
        nodeList.add(new graphNode("C", 2 ));
        nodeList.add(new graphNode("D", 3 ));
        nodeList.add(new graphNode("E", 4 ));
        graphClass gClass = new graphClass(nodeList);
        gClass.addUndirectedEdge(0,1);
        gClass.addUndirectedEdge(0,2);
        gClass.addUndirectedEdge(0,3);
        gClass.addUndirectedEdge(1,4);
        gClass.addUndirectedEdge(2,3);
        gClass.addUndirectedEdge(3,4);
        System.out.println(gClass.toString());
    }
}
