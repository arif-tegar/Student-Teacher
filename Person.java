public class Person {
    private String name;
    private int age;
    private int number;

    // Constructor
    public Person() {
        name = "";
        age = 0;
        number = 0;
    }

    // Constructor dengan parameter
    public Person(String name, int age, int number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Number: " + number);
    }
}
