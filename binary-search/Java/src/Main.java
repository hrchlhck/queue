import classes.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] vec = {-1, 1, 2, 3, 4, 10, 50, 300};
        int searchIndex = BinarySearch.search(vec, 0, 7, 1);
        System.out.println(searchIndex);
    }
}
