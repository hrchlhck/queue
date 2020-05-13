import classes.Tree;
import classes.TreeTraversal;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(6);
        tree.insert(10);
        tree.insert(8);
        tree.insert(3);
        tree.insert(4);
        tree.insert(11);
        tree.insert(13);
        tree.insert(12);
        tree.insert(13);

        System.out.println("=======================================");
        tree.removeSmallest();
        TreeTraversal.preOrder(tree.getRoot());
    }
}
