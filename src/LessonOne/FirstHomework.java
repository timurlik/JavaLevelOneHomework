package LessonOne;

public class FirstHomework {
    public static void main (String[]args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    //Метод printThreeWords
    public static void printThreeWords () {
        System.out.print("Orange\nBanana\nApple\n");
    }
    //Метод checkSumSign
    public static void checkSumSign () {
        int a = 10;
        int b = -20;
        int c = a + b;
        if (c >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }
    //Метод printColor
    public static void printColor () {
        int value = 12;
        if (value <= 0) System.out.println("Красный");
        else if (0 > value || value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    //Метод compareNumber
    public static void compareNumbers () {
        int a = 10;
        int b = 15;
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }
}