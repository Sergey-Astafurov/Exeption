package Homme.homme_1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task {
    // 1 Реализуйте 3 метода, чтобы в каждом из них получить разные стандартные для Java исключения;
    public static void main(String[] args) {
        int[]arr = new int[]{1,2,4,5};

        System.out.println(findValue(arr, 1));
        System.out.println(byZero(1, 0));
        NotFoundFile("sdsf/sf");
    }
    public static int findValue (int[] arr, int index){
        return arr[index];
    }
    public static int byZero(int a, int b){
        return a / b;
    }
    public static void NotFoundFile(String nameFile) {
        File f = new File(nameFile);
      try (FileReader fr = new FileReader(f)) {
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }

}
