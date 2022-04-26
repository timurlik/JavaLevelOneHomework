package LessonSixth;

public class Main {

    public static void main(String[]args) {
        Cat cat = new Cat("Животное", "Борис", "Черный", 3);
        Dog dog = new Dog("Животное", "Бобик", "Серый", 5);

        System.out.println(dog.toString());
        dog.voice();
        dog.swim(11);
        //Если собачка утонет, побежать не сможет! В следующей переменной нужно указывать сколько назанчили собачке проплыть.
        dog.run(500, 11);

        System.out.println(cat.toString());
        cat.voice();
        cat.swim();
        cat.run(200);

    }

}
