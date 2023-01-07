package JavaSelfLearning.Graph.graphMatrix;

public class graphNode {
    public String name;
    public int index;
    //isVisited: when we visited the node, we set it to true
    public boolean isVisited = false;

    public graphNode(String name, int index){
        this.name = name;
        this.index = index;
    }
}
