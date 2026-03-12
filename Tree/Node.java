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
    private Node left, right;

    public Node(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void setLeft(Node node) {
        this.left = node;
    }

    public void setRight(Node node) {
        this.right = node;
    }

    public T getData() {
        return data;
    }

    public Node getLeft() {
        return this.left;
    }

    public Node getRight() {
        return this.right;
    }
}
