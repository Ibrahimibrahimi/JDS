
public class Main {
    public static void main(String[] args) {
        LinkedList test = new LinkedList();
        test.addData(50);
        test.addData("ibrahim");
        test.addData(12.5);
        test.addNode(new Node(12));;
        System.out.println(test.toString());
    }
}