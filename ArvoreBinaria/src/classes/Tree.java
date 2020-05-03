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
}