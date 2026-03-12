
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
    

}