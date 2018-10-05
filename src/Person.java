import java.util.Scanner;

public class Person {
    Scanner input = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int age;
    private float salary;



    public Person (String firstName, String lastName, int age, float salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void print(){
        System.out.println(getFirstName() + "; " + getLastName() + "; "
                + getAge() + "; " + getSalary());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
