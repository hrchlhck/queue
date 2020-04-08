import classes.LinkedList;
import classes.Node;

public class Main {
    public static void main(String[] args){
        LinkedList l = new LinkedList();

        l.insertLast(1);
        l.insertLast(10);
        l.insertLast(11);
        l.insertLast(100);
        l.insertLast(101);
        l.insertOrdered(2);
        l.print();
    }
}
