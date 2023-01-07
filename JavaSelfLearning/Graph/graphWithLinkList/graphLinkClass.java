package JavaSelfLearning.Graph.graphWithLinkList;

import java.util.ArrayList;

public class graphLinkClass {
    ArrayList<graphLinkNode> nodeList = new ArrayList<graphLinkNode>();
    public graphLinkClass(ArrayList<graphLinkNode> nodeList){
        this.nodeList = nodeList;
    }

    public void addUndirectedEdge(int i, int j){
        graphLinkNode first = nodeList.get(i);
        graphLinkNode second = nodeList.get(j);
        first.neighbors.add(second);
        second.neighbors.add(first);
    }


    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + ": ");
            for (int j =0; j < nodeList.get(i).neighbors.size(); j++) {
                if (j == nodeList.get(i).neighbors.size()-1 ) {
                    s.append((nodeList.get(i).neighbors.get(j).name) );
                } else {
                    s.append((nodeList.get(i).neighbors.get(j).name) + " -> ");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }
}
