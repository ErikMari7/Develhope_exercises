package JavaAdvanced.Capitolo2.esercizio2;

public class Student {

    public String name;

    public String getName() {
        return name;
    }

    public int age;

    public int getAge() {
        return age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
