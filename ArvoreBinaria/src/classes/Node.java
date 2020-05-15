package classes;

public class Node {
    private int data;
    private Node right;
    private Node left;

    public Node(int data){
        right = null;
        left = null;
        this.data = data;
    }

    public int getData(){
        return data;
    }

    public Node getRight(){
        return right;
    }

    public Node getLeft(){
        return left;
    }

    public void setRight(Node node){
        right = node;
    }

    public void setLeft(Node node){
        left = node;
    }

    public void setData(int data) {
        this.data = data;
    }

    protected boolean hasNoChildren() {
        return right == null && left == null;
    }

    protected boolean hasBothChildren() {
        return right != null && left != null;
    }
}
