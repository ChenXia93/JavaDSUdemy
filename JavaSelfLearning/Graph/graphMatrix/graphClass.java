package JavaSelfLearning.Graph.graphMatrix;
import JavaSelfLearning.Stack.StackLinkedList.LinkedList;

import java.util.ArrayList;
public class graphClass {
    ArrayList<graphNode> arrayList = new ArrayList<graphNode>();
    int[][] adjacencyMatrix;

    public graphClass(ArrayList<graphNode> nodeList){
        this.arrayList = nodeList;
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()];

    }

    public void addUndirectedEdge(int i, int j){
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;

    }

    //getNeighbors
    public ArrayList<graphNode> getNeighbor(graphNode node){
        ArrayList<graphNode> neighbors = new ArrayList<>();
        int nodeIndex = node.index;
        for(int i = 0; i < adjacencyMatrix.length; i++){
            if(adjacencyMatrix[nodeIndex][i] == 1){
                neighbors.add(arrayList.get(i));
            }
        }
        return neighbors;
    }

//    public void bfsVisit(graphNode node){
//        LinkedList<graphNode> queue = new LinkedList<graphNode>();
//        queue.add(node);
//        while(!queue.isEmpty()){
//            GraphNode currentNode = queue.remove(0);
//        }
//    }





    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("   ");
        for (int i = 0; i < arrayList.size(); i++) {
            s.append(arrayList.get(i).name + " ");
        }
        s.append("\n");
        for (int i = 0; i < arrayList.size(); i++) {
            s.append(arrayList.get(i).name + ": ");
            for (int j : adjacencyMatrix[i]) {
                s.append((j) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}
