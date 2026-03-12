public class Node<T> {
    private T data;
    private Node next;
    public Node(T data){
        this.data = data;
        this.next = null;
    }
    public void addNext(Node node){
        this.next = node;
    }
    public T getData(){
        return data;
    }
}
