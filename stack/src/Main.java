public class Main {
    public static void main(String[] args) {
        Arraystack stack=new Arraystack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.pop();

        stack.printArrayStack();
    }
}