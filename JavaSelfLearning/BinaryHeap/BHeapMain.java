package JavaSelfLearning.BinaryHeap;

public class BHeapMain {
    public static void main(String [] args){
        BinaryHeap binaryHeap = new BinaryHeap(8);
        binaryHeap.insert(10,"Min");
        binaryHeap.insert(20,"Min");
        binaryHeap.insert(30,"Min");
        binaryHeap.insert(40,"Min");
        binaryHeap.insert(50,"Min");
        binaryHeap.insert(60,"Min");
        binaryHeap.insert(80,"Min");
        binaryHeap.levelOrder();
        binaryHeap.extract("Min");
        binaryHeap.levelOrder();
    }
}
