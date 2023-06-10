import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {

        int[] arr = new int[] { };
        System.out.println(Mylist2(arr, 8, 100));
    }

    private static int Mylist(int[] arr, int size) {
        int length = arr.length;
        if (length < size) {
            return -1;
        }
        return length;

    }


    private static int Mylist2(int[] arr, int value, int size) {
        int length = arr.length;
        if (length < size) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
            continue;
        }
        return  -3;


    }
}
