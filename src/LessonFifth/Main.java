package LessonFifth;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printArray();
    }
    public static void printArray() {
        Employees[] employeesArray = new Employees[5];
        employeesArray[0] = new Employees("Иванов Иван Иванович", "Служащий", "ivanov@mail.ru", "89999999", 40000, 35);
        employeesArray[1] = new Employees("Петров Василий Алексеевич", "Электрик", "petrov@mail.ru", "87777777", 50000, 40);
        employeesArray[2] = new Employees("Елисеева Светлана Леонидовна", "Повар", "eliseeva@mail.ru", "86666666", 35000, 45);
        employeesArray[3] = new Employees("Магомедов Магомед Магомедович", "Инженер", "magomedov@mail.ru", "85555555", 45000, 32);
        employeesArray[4] = new Employees("Степанова Людмила Андреевна", "Кассир", "stepanova@mail.ru", "84444444", 48000, 52);
        for (int i = 0; i < employeesArray.length; i++) {
            System.out.println(employeesArray[i]);
        }
    }
}


