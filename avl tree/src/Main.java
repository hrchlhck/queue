import Classes.AVLTree;

public class Main {
    public static void main(String[] args) {
        AVLTree t = new AVLTree();
        t.insert(1);
        t.insert(2);
        t.insert(3);
        t.insert(4);
        t.insert(5);
        t.insert(6);
        t.insert(7);
        t.insert(8);
        t.insert(9);
        t.insert(10);
        t.preOrder();

        System.out.println("Height: " + t.height());
    }
}
