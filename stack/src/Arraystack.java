public class Arraystack {
    int maxSize; // max size of array
    int top;//index of the top element
    private int[] stackArray;//Array to store stsck elements


    public Arraystack(int size){
        maxSize=size;
        stackArray=new int[maxSize];
        top=-1;//initialize top -1


    }
    // check if the stack is Empty
    public boolean isEmpty(){
        return top==-1;

    }
    //check if the stack is full
    public boolean isFull(){
        return top==maxSize-1;
    }
    public void push(int value){
        if(isFull()){
            System.out.println("Stack is full.Cannot push");
            return;
        }
        stackArray[++top]=value;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty .cannot pop");
            return -1;
        }
        return stackArray[top--];
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("stack is Empty");
        }
            return stackArray[top];
    }
    public int size(){
        return top+1;
    }

    public void printArrayStack(){
        while (!isEmpty()){
            System.out.print(stackArray[top]+",");

            top--;
        }

    }



}



