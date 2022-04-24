package LessonFifth;

public class Employees {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employees(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }


    public String getFullName() {return fullName;}
    public void setFullName (String fullName) {this.fullName = fullName;}

    public String getPosition() {return position;}
    public void setPosition (String position) {this.position = position;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber (String phoneNumber) {this.phoneNumber = phoneNumber;}

    public int getSalary() {return salary;}
    public void setSalary(int salary) {this.salary = salary;}

    public int getAge() {return age;}
    public void setAge (int age) {this.age = age;}

public String toString() {
        return "Full name: " + fullName + " position: " + position + " email: " + email + " Phone number: "
                + phoneNumber + " salary: " + salary + " age: " + age;
    }
}
