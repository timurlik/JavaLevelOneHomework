import java.util.Random;
import java.util.Scanner;

public class TicTacToeHomeworkFour {

    public static char[][] map; //Создание массива поля.
    public static int SIZE = 3; //Инициализация размера поля.
    public static int DOTS_TO_WIN = 3; //Количество фишек до победы.
    public static final char DOT_EMPTY = '.'; //Символ поля.
    public static final char DOT_X = 'x'; //Символ поля.
    public static final char DOT_O = 'o'; //Символ поля.
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main (String[]args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            //Проверка заполнение дивгональных полей cимволом x, используя метод checkWin в который вложен метод DOT_X с переменной 'x'.
            if (checkWin(DOT_X)) {
                System.out.println("Вы победили!");
                break;
            }
            //Проверка поля на ничью, используя метод isMapFull, метод пробегается по массиву и отслеживает там наличие символов '.'.
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            //Проверка заполнение дивгональных полей cимволом o, используя метод checkWin в который вложен метод DOT_O с переменной 'o'.
            if (checkWin(DOT_O)) {
                System.out.println("Победил Компьютер");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена!");
    }
    //Инициализация поля. Цикл пробегает по всем ячейка массива и в каждую записывает DOT_EMPTY
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    //ВЫвод поля в консоль.
    //Первый цикл i отвечает за распечатку шапки поля. Цикл i,j, за печать самого поля.
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        //Печать поля и левой нумерации. Метод принмает значение x,y и увеличивает каждое на один.
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + "  ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты X Y");
            x = sc.nextInt() - 1; //Запрос координат .
            y = sc.nextInt() - 1; //Запрос координат.
        }   while (!isCellValid(x, y)); //Проверка, если ячейка свободна .
        map[y][x] = DOT_X; //Проставка крестика на поле, если ячейка свободна.
    }
    //Метод проводит валидацию значений x, y и возвращает булево значение.
    public static boolean isCellValid (int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false; //Проверяет граничность введеных значений.
        if (map[y][x] == DOT_EMPTY) return true; //Проверяет значение на свободность в поле.
        return false; //Если ни одно условие не срабатывает, возвращает false.
    }
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE); //Создание числа x, с использование Random ограниченного размером SIZE
            y = rand.nextInt(SIZE); //Создание числа y, с использование Random ограниченного размером SIZE
        } while (!isCellValid(x, y)); //Метод работает, если isCellValid(x, y) возвращает false и с помощью ! инвертирует его
        System.out.println("Компьютер проходил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
        //Метод rand.nextInt(n) возвращает случайное число в диапазоне от 0 до n – 1 включительно.
    }
    //Метод проверяет поле на возможность выиграша компьютером или человеком.
    public static boolean checkWin(char dot) {
        for (int i = 0; i < 3; i++) {
            if ((map[i][0] == dot && map[i][1] == dot && map[i][2] == dot) || (map[0][i] == dot && map[1][i] == dot && map[2][i] == dot)) return true;
        }
        if ((map[0][0] == dot && map[1][1] == dot && map[2][2] == dot) || (map[2][0] == dot && map[1][1] == dot && map[0][2] == dot)) return true;
        return false;
    }
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
}
