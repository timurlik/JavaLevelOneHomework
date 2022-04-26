package LessonSixth;

public class Cat extends Animals {

    public Cat (String type, String name, String color, int age) {
        super(type, name, color, age);

    }
    public void swim() {
        System.out.println("Кошечка не умеет плавать...");
    }

    public void voice() {
        System.out.println("Мяу-мяу...");
    }
    public void run(int getDistanceForCatRun) {
        if (getDistanceForCatRun < 201) {
            System.out.println("Кошечка пробежала " + getDistanceForCatRun + " метров...\n");
        } else System.out.println("Кошечка столько не пробежит, устанет...");
    }
}
