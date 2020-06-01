package classes.hash_table;

public class HashTable {
    private int collisionCount;
    private int totalElements;
    private TableNode[] table;

    public HashTable(int size) {
        table = new TableNode[size];
        collisionCount = 0;
        totalElements = 0;
        _initTable();
        _fillTable();
    }

    private void _initTable() {
        for(int i = 0; i < table.length; i++) {
            table[i] = new TableNode(-1);
        }
    }

    public void insert(int key) {
        int hash = _hash(key);
        TableNode tn = table[hash];
        if(tn.getData() != -1) {
            collisionCount++;
        }
        tn.insert(key);
        totalElements++;
    }

    private int _hash(int key) {
        return key % table.length;
    }

    private void _fillTable() {
        int rand;
        int max = (int) (table.length * 0.9);
        for(int i = 0; i < max; i++) {
            rand = (int) (Math.random() * 1000000);
            insert(rand);
        }
    }

    public void print() {
        for(int i = 0; i < table.length; i++) {
            if(table[i].getData() == -1) {
                System.out.println(i + " | " + table[i].getData() + "     | " + table[i].print());
            } else {
                System.out.println(i + " | " + table[i].getData() + " | " + table[i].print());
            }
        }
    }

    public boolean search(int data) {
        int i = _hash(data);
        TableNode tn = table[i];

        if(tn.getData() == data) {
            return true;
        }
        return tn.search(data);
    }

    public int getCollisionCount() {
        return collisionCount;
    }

    public int getTotalElements() {
        return totalElements;
    }
}
