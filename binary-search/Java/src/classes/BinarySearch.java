package classes;

public class BinarySearch {
    public static int search(int[] vector, int start, int end, int elem){
        if(start >= end){
            return -1;
        } else {
            int mid = (start + end) / 2;
            if(start + end == 1 && vector[0] == elem){
                return 0;
            }
            if (vector[mid] == elem) {
                return mid;
            }
            if(vector[mid] > elem) {
                return search(vector, start, mid, elem);
            } else {
                return search(vector, mid + 1, end, elem);
            }
        }
    }
}
