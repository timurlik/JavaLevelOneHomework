package LessonThree;
import java.util.Scanner;
import java.util.Arrays;

public class HomeworkThree {
    public static void main (String[] args) {
    firstTask();
    secondTask();
    thirdTask();
    fourthTask();
    fifthTask();
    }
    //Первое задание
    public static void firstTask() {
        int[] arr = {0, 1, 0, 0, 1, 1, 0, 1, 1, 0};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    arr[i] = 1;
                }   else {
                    arr[i] = 0;
                }
            } System.out.println(Arrays.toString(arr));
            System.out.println("Окончание первого задания\n");
    }
    //Второе задание
    public static void secondTask() {
        int[]arr = new int [100];
            for (int i = 0; i < arr.length; i++ ) {
                arr[i] = i + 1;
                //Первый вариан печати массива в консоль.
                System.out.println("arr[" + i + "]" + " = " + arr[i]);
            }   //Другой, менее творческий вариант.
        System.out.println("\narr[] = " + Arrays.toString(arr));
            System.out.println("Окончание второго задания\n");
    }
    //Третье задание
    public static void  thirdTask() {
        int[]arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) {
                    arr[i] = arr[i] * 2;
                } else {
                    arr[i] = arr[i];
                }
            }
        System.out.println(Arrays.toString(arr));
            System.out.println("Окончание третьего задания\n");
    }
    //Четвертое задание
    public static void fourthTask() {
        int[][]table = new int[9][9];
            for (int i = 0; i < table.length; i++) {
                for (int j = 0; j < table.length; j++) {
                        if (i == j || i + j == 8) {
                            table[i][j] = 1;
                            System.out.print(table[i][j] + " ");
                        }   else {
                            System.out.print("   ");
                        }
                }   System.out.println();
            }   System.out.println("Окончание четвертого задания\n");
    }
    public static void fifthTask() {
            Scanner sc = new Scanner (System.in);
            System.out.println("Введите длинну массива: ");
            int len = sc.nextInt();
            System.out.println("Введите значения для ячеек массива: ");
            int initialValue = sc.nextInt();
            sc.close();

            int[]arr = new int[len];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = initialValue;
            }
            System.out.println(Arrays.toString(arr));

    }
}
