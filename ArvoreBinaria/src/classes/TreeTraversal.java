package classes;

public class TreeTraversal {
    public static void preOrder(Node tree) {
        if (tree != null) {
            System.out.println(tree.getData());
            preOrder(tree.getLeft());
            preOrder(tree.getRight());
        }
    }

    public static void posOrder(Node tree) {
        if (tree != null) {
            posOrder(tree.getLeft());
            posOrder(tree.getRight());
            System.out.println(tree.getData());
        }
    }

    public static void inOrder(Node tree){
        if(tree != null){
            posOrder(tree.getLeft());
            System.out.println(tree.getData());
            posOrder(tree.getRight());
        }
    }
}
