
public class Main {
    public static void main(String[] args) {
        LinkedList test = new LinkedList();
        test.addData(50);
        test.addData("ibrahim");
        test.addData(12.5);

        System.out.println(test.toString());

        // test for circular
        LinkedList l = new LinkedList();
        l.addNodes(
                new Node(1),
                new Node(55));
        System.out.println(l.toString());
    }
}