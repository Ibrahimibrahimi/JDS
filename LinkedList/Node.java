public class Node<T> {
    /*
     * The '<T>' is called a generator ,
     * that means no matter the data type u want
     * to make this node (integer, string...)
     * u don't have to define all constructors for
     * each type , just make : Node mynode = new Node<String>Node()
     * or the type u want
     */
    private T data;
    private Node next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public void addNext(Node node) {
        this.next = node;
    }

    public T getData() {
        return data;
    }

    public Node getNext() {
        return this.next;
    }
}
