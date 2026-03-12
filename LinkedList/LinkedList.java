
public class LinkedList {
    private Node HEAD, TAIL;
    private int SIZE;
    private String sep = "=>";

    public LinkedList() {
        this.HEAD = null; // if no head by default is null
        this.TAIL = null;
        this.SIZE = 0;
    }

    public LinkedList(Node DefaultHead) {
        this.HEAD = DefaultHead; // if no head by default is null
        this.TAIL = null;
        this.SIZE = 1;
    }

    public void addNode(Node node) {
        // if no head => add as head , if head => add as last item
        if (this.HEAD == null) {
            this.HEAD = node;
            return;
        }
        Node temp = this.HEAD;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.addNext(node);
        this.SIZE++;
        this.TAIL = node;
    }

    public void addData(Object data) {
        // used to add data directly instead of create the node (node created auto)
        Node node = new Node(data);
        this.addNode(node); // TAIL and SIZE are update throught this
    }
    public void addNodes(Node ...node){
        for(Node n : node){
            addNode(n);
        }
    }

    public String toString() {
        /*
         * 1. loop for elements
         * 2. if element can be printed(primitive types) => print
         */
        String OUTPUT = "";
        if (this.HEAD == null) {
            return "[Empty Linked List]";
        }
        Node temp = this.HEAD;
        while (temp.getNext() != null) {
            OUTPUT += this.output(temp); // print current
            OUTPUT += this.sep;
            temp = temp.getNext(); // pass to next
        }
        OUTPUT += this.output(this.TAIL); // dont forget me
        OUTPUT += this.sep;
        OUTPUT += "[NULL]";
        return OUTPUT;
    }

    public String output(Node node) {
        if (node.getData() instanceof Integer || node.getData() instanceof Double || node.getData() instanceof Long) {

            return "" + node.getData();
        }
        if (node.getData() instanceof String) {
            return node.getData() + "";
        }
        return "[NODE DATA]";
    }
}