package LessonSixth;

public class Dog extends Animals {

    public Dog (String type, String name, String color, int age) {
        super (type, name, color, age);

    }
    public void swim (int getDistanceForDogSwim) {
        if (getDistanceForDogSwim < 11) {
            System.out.println("Собачка проплыла " + getDistanceForDogSwim +" метров");
        } else System.out.println("Собачка утонула!");
    }
    public void voice() {
        System.out.println("Гав-гав-гав...");
    }
    public void run(int getDistanceForDogRun, int getDistanceForDogSwim) {
        if (getDistanceForDogSwim < 11) {
            if (getDistanceForDogRun < 501) {
                System.out.println("Собачка пробежала " + getDistanceForDogRun + " метров\n");
            } else System.out.println("Собачка столько не пробежит, устанет...\n");
        } else System.out.println("Собачка не может побежать, она утонула!\n");
    }
}
