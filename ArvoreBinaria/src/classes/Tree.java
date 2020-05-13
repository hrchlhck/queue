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

    public void removeLargest() {
        root = _removeLargest(root);
    }

    public void removeSmallest() {
        root = _removeSmallest(root);
    }

    public void remove(int data) {
        root = _remove(root, data);
    }

    private Node insertRecursive(Node n, int data) {
        if (n == null) {
            return new Node(data);
        } else {
            if (data >= n.getData()) {
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

    private int getHeight(Node n) {
        if(n == null) {
            return -1;
        } else {
            int left = getHeight(n.getLeft());
            int right = getHeight(n.getRight());

            if(left > right) {
                return left + 1;
            }
            return right + 1;
        }
    }

    private Node _removeLargest(Node n) {
        if(n == null) {
            return null;
        } else if(n.getRight() == null) {
            return n.getLeft();
        } else {
            Node temp = n.getRight();
            n.setRight(_removeLargest(temp));
            return n;
        }
    }

    private Node _removeSmallest(Node n){
        if(n == null) {
            return null;
        } else if(n.getLeft() == null) {
            return n.getRight();
        } else {
            n.setLeft(_removeSmallest(n.getLeft()));
            return n;
        }
    }

    private Node _remove(Node n, int data) {
        if(n == null) {
            return null;
        }

        if(data >= n.getData()) {
            n.setRight(_remove(n.getRight(), data));
        } else {
            n.setLeft(_remove(n.getLeft(), data));
        }

        if(n.getData() == data) {
            Node temp;
            if (n.hasNoChildren()) {
                return null;
            } else if (n.hasBothChildren()) {
                temp = n.getRight();
                n = getMin(n);
                n.setRight(temp);
            } else if (n.getLeft() == null) {
                return n.getRight();
            } else if (n.getRight() == null) {
                return n.getLeft();
            }
        }
        return n;
    }

    private Node getMin(Node n) {
        Node min = null;
        while(n != null) {
            min = n;
            n = n.getLeft();
        }
        return min;
    }
}