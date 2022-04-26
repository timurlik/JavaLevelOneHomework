package LessonTwo;

public class HomeworkTwo {
    public static void main(String[] args) {
        System.out.println(compareFigures(10, 5));
        System.out.println();//Для переноса строки
        isPositiveOrNegative(0);
        System.out.println();//Для переноса строки
        System.out.println(isPositiveOrNegativeBoolean(10));
        System.out.println();//Для переноса строки
        printStringSomeTimes("Строка номер ", 5);
        System.out.println();//Для переноса строки
        System.out.println(ifLeapYear(800));
    }
    //Сравнение суммы чисел на больше десяти и меньше двадцати.
    public static boolean compareFigures(int a, int b) {
        return ((a + b) >= 10 && (a + b) <= 20);
    }
    //Отрицательное число или роложительное
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    //Отрицательно число или положительное, булево сравнение
    public static boolean isPositiveOrNegativeBoolean(int c) {
        return c <= 0;
    }
    //Напечатавание строки указанное колличество раз
    public static void printStringSomeTimes(String y, int z) {
        for (int i = 1; i <= z; i++) {
            System.out.println(y + ": " + i);
        }
    }
    //Метод определяющий високосный год
    public static boolean ifLeapYear (int e){
        return ((e % 4 == 0) && (e % 100 != 0) || (e % 400 == 0));
    }
}