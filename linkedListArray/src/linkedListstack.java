public class linkedListstack<T> {
    Node<T>top;

    static class Node<T>{
        T data;
        Node<T>next;
        Node(T data){
            this.data=data;
            this.next=null;
        }

    }
    public boolean isEmpty(){
        return top== null;

    }
    public void push(T data){
        Node<T>newNode=new Node<>(data);
        newNode.next=top;
        top=newNode;

    }
    public T pop(){
        if(isEmpty()){
            System.out.println("stack is null");
            return null;
        }
        T data=top.data;
        top=top.next;
    }



}
