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

    public Node removeLargest() {
        return _removeLargest(root);
    }

    public Node removeSmallest() {
        return _removeSmallest(root);
    }

    public Node remove(int data) {
        return _remove(root, data);
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

    private Node _removeSmallest(Node n) {
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
            if (n.hasNoChildren()) {
                return null;
            } else if (n.hasBothChildren()) {
                Node temp = getMin(n.getRight());
                _remove(n, temp.getData());
                n.setData(temp.getData());
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

    /*
    *       10
    *      2  12
    *
    * */
}