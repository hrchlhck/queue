import classes.hash_table.HashTable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashTable ht = createTable();
        ht.print();
        System.out.println("Total of filled nodes: " + ht.getTotalElements());
        System.out.println("Number of collisions: " + ht.getCollisionCount());
        searchOnTable(ht);
    }

    public static HashTable createTable() {
        HashTable hashtable = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the size of the hash table: ");
        String input = scanner.next();

        try {
            int size = Integer.parseInt(input);
            hashtable = new HashTable(size);
            System.out.println("Created hash table of size " + size);
        } catch (NumberFormatException e) {
            System.out.println("You must type numeric values only");
        }

        return hashtable;
    }

    public static void searchOnTable(HashTable ht) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean loop = true;
        try {
            while(loop) {
                System.out.print("Type the number you want to search: ");
                input = scanner.next();
                if(Integer.parseInt(input) != -1) {
                   System.out.println("The element " + input + " exists? -> " + ht.search(Integer.parseInt(input)));
                } else {
                    System.out.println("Exiting program with exit code 0");
                    loop = false;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("You only must type numeric values");
        }
    }
}
