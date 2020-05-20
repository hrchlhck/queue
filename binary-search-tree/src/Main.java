import classes.Tree;
import classes.TreeTraversal;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(12);
        tree.insert(11);
        tree.insert(13);
        tree.insert(14);

        TreeTraversal.preOrder(tree.getRoot());
    }
}
