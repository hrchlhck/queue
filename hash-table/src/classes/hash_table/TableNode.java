package classes.hash_table;

import classes.linked_list.LinkedList;

public class TableNode {
    private int data;
    private LinkedList list;

    public TableNode(int data) {
        this.data = data;
        this.list = null;
    }

    public int getData() {
        return data;
    }

    public void insert(int val) {
        if(data == -1) {
            data = val;
            list = new LinkedList();
        } else {
            list.insertLast(val);
        }
    }

    public boolean search(int data) {
        return list.exists(data);
    }

    public String print() {
        if(list != null) {
            return list.print();
        }
        return "[]";
    }
}
