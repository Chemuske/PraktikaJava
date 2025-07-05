package Day10;

public class Node {
    public int value;
    public Node leftNode;
    public Node rightNode;

    protected void addNode(int nodeValue) {

        Node newNode = new Node();
        newNode.value = nodeValue;
        
        if (nodeValue < this.value) {
            // Если новое значение меньше - добавляем в левое поддерево
            if (leftNode == null) {
                leftNode = newNode;
            } else {
                leftNode.addNode(nodeValue);
            }
        } else {
            // Если новое значение больше или равно - добавляем в правое поддерево
            if (rightNode == null) {
                rightNode = newNode;
            } else {
                rightNode.addNode(nodeValue);
            }
        }
    }

    protected void printTree(Node node) {

        if (node == null) {
            return;
        }

        printTree(node.leftNode);

        System.out.print(node.value + " ");

        printTree(node.rightNode);
    }
}
