package classes;

public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node n, int data){
        if(n == null){
            return new Node(data);
        } else {
            if(data >= n.getData()){
                n.setRight(insertRecursive(n.getRight(), data));
            } else {
                n.setLeft(insertRecursive(n.getLeft(), data));
            }
            return n;
        }
    }

    public int height() {
        return getHeight(root);
    }

    private int getHeight(Node r) {
        if(r == null || (r.getLeft() == null && r.getRight() == null)) {
            return -1;
        } else {
            int rightHeight = 0;
            int leftHeight = 0;

            if(r.getRight() != null){
                rightHeight = getHeight(r.getRight()) + 1;
            } else if(r.getLeft() != null) {
                leftHeight = getHeight(r.getLeft()) + 1;
            }

            if(leftHeight > rightHeight){
                return leftHeight;
            }
            return rightHeight;
        }
    }
}