package Structures;

import LinkedList.LinkedList;

public class Queue {
    private LinkedList queue;

    public Queue() {
        queue = new LinkedList();
    }

    public void queue(int data){
        queue.insertFirst(data);
    }

    public Integer dequeue() {
        try{
            return queue.removeLast().getInfo();
        } catch (NullPointerException e){
            System.out.println("The queue is empty.");
            return null;
        }
    }

    public void print() {
        if(queue.empty()){
            System.out.println("The queue is empty.");
        } else {
            queue.print();
        }
    }

    public int length() {
        return queue.length();
    }
}

