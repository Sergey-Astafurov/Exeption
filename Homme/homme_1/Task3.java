package Homme.homme_1;

public class Task3 {
    // Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.

    public static void main(String[] args) {
        int[] arra1 = new int[]{1,2,3,4,5};
        int[] arra2 = new int[]{1,2,3,4,5};
        int[] arr3=  new int[]{};
        int[] res = sumArrays(arra1, arra2, arr3);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
    public static int[] sumArrays(int[] a, int[] b, int[] newArr){

        if (a.length == b.length){
            newArr = new int[a.length];
        }else{
            System.out.println("Массивы не равны, отмена операции");

        }
        int i = 0;
        while(i<a.length){
            newArr[i] = a[i] - b[i];
            i++;
        }
        return newArr;
    }
}
