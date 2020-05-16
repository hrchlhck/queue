package Classes;

public class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public int getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int height() {
        return _height(this);
    }

    public int balanceFactor() {
        return _height(this.getLeft()) - _height(this.getRight());
    }

    public boolean hasNoChildren() {
        return left == null && right == null;
    }

    public boolean hasBothChildren() {
        return left != null && right != null;
    }

    private int _height(Node node) {
        if(node == null) {
            return -1;
        } else {
            int left = _height(node.getLeft());
            int right = _height(node.getRight());

            if(left > right) {
                return left + 1;
            }
            return right + 1;
        }
    }
}
