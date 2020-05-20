package Structures;

import LinkedList.LinkedList;
import LinkedList.Node;

public class Stack {
    private LinkedList stack;
    private Node top;

    public Stack(){
        stack = new LinkedList();
        top = null;
    }

    public void stack(int data){
        top = new Node();
        top.setInfo(data);
        stack.insertLast(data);
    }

    public Integer unstack() {
        if (stack.empty()) {
            System.out.println("The stack is empty.");
            return null;
        } else {
            return stack.removeLast().getInfo();
        }
    }

    public Integer top() {
        if (top == null) {
            System.out.println("The stack is empty");
            return null;
        } else {
            return top.getInfo();
        }
    }

    public void print() {
        if(stack.empty())
            System.out.println("The stack is empty.");
        else
            stack.print();
    }

    public int length() {
        return stack.length();
    }
}
