import Structures.Queue;
import Structures.Stack;

public class Main {
    public static void main(String[] args) {
        testQueue();
    }

    public static void testQueue() {
        Queue q = new Queue();

        q.queue(1);
        q.queue(10);
        q.queue(11);
        q.queue(100);
        q.queue(101);

        q.print();

        System.out.println("\n====================================================\n");

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        System.out.println("\n====================================================\n");

        q.print();
        System.out.println("\n====================================================\n");

        q.queue(200);
        q.print();
        System.out.println("\n====================================================\n");

        q.dequeue();
        q.print();
    }

    public static void testStack() {
        Stack s = new Stack();

        s.stack(1);
        s.stack(10);
        s.stack(11);
        s.stack(100);
        s.stack(101);

        s.print();

        System.out.println("\n====================================================\n");
        System.out.println(s.unstack());
        System.out.println(s.unstack());
        System.out.println(s.unstack());
        System.out.println("\n====================================================\n");
        s.print();
        System.out.println("\n====================================================\n");
        s.stack(222);
        s.stack(123981239);
        s.print();
    }
}
