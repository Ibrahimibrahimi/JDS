
public class LinkedList {
    private Node HEAD , TAIL;
    private int SIZE;
    public LinkedList(){
        this.HEAD = null; // if no head by default is null
        this.TAIL = null;
        this.SIZE = 0;
    }
    
    public LinkedList(Node DefaultHead){
        this.HEAD = DefaultHead; // if no head by default is null
        this.TAIL = null;
        this.SIZE = 1;
    }
    
    public void addNode(Node node) {
        // if no head => add as head , if head => add as last item
        if (this.HEAD == null){
            this.HEAD = node;
            return;
        }
        Node temp = this.HEAD;
        while(temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.addNext(node);
    }

}