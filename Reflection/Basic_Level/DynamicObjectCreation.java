import java.lang.reflect.Constructor;
import java.util.Scanner;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class DynamicObjectCreation {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter student's name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student's age: ");
            int age = scanner.nextInt();

            Class<?> clazz = Class.forName("Student");
            Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
            Object studentObj = constructor.newInstance(name, age);

            studentObj.getClass().getMethod("display").invoke(studentObj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}