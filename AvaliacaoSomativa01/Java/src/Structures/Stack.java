package Structures;

import LinkedList.LinkedList;

public class Stack {
    private LinkedList stack;

    public Stack(){
        stack = new LinkedList();
    }

    public void stack(int data){
        stack.insertLast(data);
    }

    public int unstack(){
        if(stack.empty()){
            System.out.println("The stack is empty.");
        }
        return stack.removeFirst().getInfo();
    }

    public Integer top() {
        try{
            return stack.getFirstNode().getInfo();
        } catch (NullPointerException e){
            System.out.println("The stack is empty.");
            return null;
        }
    }

    public void print() {
        if(stack.empty()){
            System.out.println("The stack is empty.");
        }
        stack.print();
    }

    public int length() {
        return stack.length();
    }
}
