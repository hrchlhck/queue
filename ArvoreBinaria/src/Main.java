import classes.Node;
import classes.Tree;
import classes.TreeTraversal;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(5);
        tree.insert(1);
        tree.insert(2);
        tree.insert(6);
        tree.insert(10);
        tree.insert(8);

        tree.remove(8);
        TreeTraversal.preOrder(tree.getRoot());
    }
}
