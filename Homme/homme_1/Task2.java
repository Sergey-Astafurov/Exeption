package Homme.homme_1;

public class Task2 {
    public static void main(String[] args) {
        // String[][] arr = {{"55","5", "234","55","5", "234","55","5", "234"},{"2","3", "2","2","3", "2","55","5", "234"}};

        System.out.println(sum2d(arr));
        // .ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2 ( когда в массиве меньше 5 строк)
        //  "main" java.lang.NumberFormatException: For input string: "5d5" (Строчный массив предполагает строки, а значит и буквы)
        //  Exception in thread "main" java.lang.StackOverflowError


    }
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

}
