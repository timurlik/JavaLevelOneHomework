package LessonSixth;

public class Animals {
    private String type;
    private String name;
    private String color;
    private int age;

    public Animals (String type, String name, String color,int age) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public String getType() {return type;}
    public void setType(String type) {this.type = type;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public String toString() {
        return "Type is: " + type + " \nName is: " + name + " \nColor is: " + color + " \nAge is: " + age;
    }
    public void voice() {
        System.out.println("Животное издает звук, характерный для своего вида");
    }
    public void swim() {
        System.out.println("Животное плывет...");
    }
    public void run(int distance) {
        System.out.println("Животное бежит...\n");
    }
}
