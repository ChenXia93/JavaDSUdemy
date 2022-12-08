package JavaSelfLearning.Stack.StackArray;

public class StackMain {
    public  static void main(String [] args){
        StackClass stack = new StackClass(5);
        boolean isStackEmpty = stack.isEmpty();
        System.out.println(isStackEmpty);
        boolean isStackFull = stack.isFull();
        System.out.println(isStackFull);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.displayStack();
        System.out.println("peeking");
        System.out.println(stack.peek());
        System.out.println("Popping");
        System.out.println(stack.pop());
        System.out.println("peeking");
        System.out.println(stack.peek());
        System.out.println("display current array ");
        stack.displayStack();
    }
}
