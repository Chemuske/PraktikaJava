package Day10;

public class Main {
    public static void main(String[] args) {
        Root root = new Root(20);

        root.addNode(14);
        root.addNode(23);
        root.addNode(22);
        root.addNode(27);
        root.addNode(24);
        root.addNode(150);

        root.addNode(16);
        root.addNode(15);
        root.addNode(18);
        root.addNode(11);
        root.addNode(5);
        root.addNode(8);

        root.printTree(root);
    }
    
}
