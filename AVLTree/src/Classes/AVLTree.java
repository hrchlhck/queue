package Classes;

public class AVLTree {
    private Node root;

    public AVLTree() {
        root = null;
    }

    public void insert(int data) {
        if(exists(data))
            System.out.println("The element already exists in the AVL tree");
        else
            root = _insert(root, data);
    }

    public void remove(int data) {
        if(!exists(data))
            System.out.println("The element does not exist in the AVL tree");
        else
            root = _remove(root, data);
    }

    public int height() {
        if(root == null)
            return -1;
        return root.getHeight();
    }

    public void inOrder() {
        _inOrder(root);
    }

    public void preOrder() {
        _preOrder(root);
    }

    public void postOrder() {
        _postOrder(root);
    }

    public boolean exists(int data) {
        Node actual = root;
        while(actual != null && actual.getData() != data) {
            if(data >= actual.getData()) {
                actual = actual.getRight();
            } else {
                actual = actual.getLeft();
            }
        }
        return actual != null;
    }

    private Node _rotateRight(Node root) {
        Node newRoot = root.getLeft();
        Node temp = newRoot.getRight();
        newRoot.setRight(root);
        root.setLeft(temp);

        return newRoot;
    }

    private Node _rotateLeft(Node root) {
        Node newRoot = root.getRight();
        Node temp = newRoot.getLeft();
        newRoot.setLeft(root);
        root.setRight(temp);

        return newRoot;
    }

    private Node _rotate(Node root) {
        int balanceFactor1 = Node.balanceFactor(root);
        int balanceFactor2;
        if(balanceFactor1 > 1) {
            balanceFactor2 = Node.balanceFactor(root.getRight());
            if(balanceFactor2 > 0) {
                root = _rotateRight(root);
            } else {
                root.setRight(_rotateRight(root.getRight()));
                root = _rotateLeft(root);
            }
        } else if(balanceFactor1 < -1) {
            balanceFactor2 = Node.balanceFactor(root.getLeft());
            if(balanceFactor2 > 0) {
                root.setLeft(_rotateLeft(root.getLeft()));
                root = _rotateRight(root);
            } else {
                root = _rotateLeft(root);
            }
        }
        return root;
    }

    private Node _insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            if (data >= root.getData()) {
                root.setRight(_insert(root.getRight(), data));
            } else {
                root.setLeft(_insert(root.getLeft(), data));
            }
            return _rotate(root);
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
        return _rotate(n);
    }

    private Node getMin(Node n) {
        Node min = null;
        while(n != null) {
            min = n;
            n = n.getLeft();
        }
        return min;
    }

    private void _inOrder(Node node) {
        if(node != null) {
            _inOrder(node.getLeft());
            System.out.println(node.getData());
            _inOrder(node.getRight());
        }
    }

    private void _preOrder(Node node) {
        if(node != null) {
            System.out.println(node.getData());
            _preOrder(node.getLeft());
            _preOrder(node.getRight());
        }
    }

    private void _postOrder(Node node) {
        if(node != null) {
            _postOrder(node.getLeft());
            _postOrder(node.getRight());
            System.out.println(node.getData());
        }
    }
}
