package Day10.Example;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] values = {20, 14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 100, 8};

        for (int value : values) {
            bst.insert(value);
        }

        System.out.println("In-order traversal of the binary search tree:");
        bst.printInOrder();
    }
}
