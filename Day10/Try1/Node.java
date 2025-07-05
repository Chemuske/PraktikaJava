package Day10.Try1;

public class Node {

    private int rightNode;
    private int leftNode;
    private int parent;
    private int value;

    public Node(int value) {
        if (value > 0) {
            this.value = value;
        }
    }

    public Node(int value, int leftNode) {
        if (value > 0) {
            this.value = value;
        }
        
        if (leftNode > 0) {
            this.setLeftNode(leftNode);
        }
    }

    public Node(int value, int leftNode, int rightNode) {
        if (value > 0) {
            this.value = value;
        }
        if (leftNode > 0) {
            this.setLeftNode(leftNode);
        }
        if (rightNode > 0) {
            this.setRightNode(rightNode);
        }
    }
    //Getters start-------------
    public int getValue() {
        return value;
    }

    public int getParent() {
        return parent;
    }

    public int getRightNode() {
        return rightNode;
    }

    public int getLeftNode() {
        return leftNode;
    }
    //Getters end -------------

    //Setters start-------------
    public void setRightNode(int rightNode) {
        if (rightNode > this.value) {
            this.rightNode = rightNode;
        }
    }
    
    public void setLeftNode(int leftNode) {
        if (leftNode < this.value) {
            this.leftNode = leftNode;
        }
    }

    public void setParent(int parent) {
        if (parent > this.value && parent > this.rightNode) {
            this.parent = parent;
        }
    }
    //Setters end-------------
}
