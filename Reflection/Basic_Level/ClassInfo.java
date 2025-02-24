import java.lang.reflect.*;

public class ClassInfo {
    public static void main(String[] args) {
        try {
            System.out.print("Enter the class name: ");
            String className = new java.util.Scanner(System.in).nextLine();
            Class<?> clazz = Class.forName(className);

            System.out.println("\nMethods:");
            for (Method method : clazz.getDeclaredMethods()) {
                System.out.println(method);
            }

            System.out.println("\nFields:");
            for (Field field : clazz.getDeclaredFields()) {
                System.out.println(field);
            }

            System.out.println("\nConstructors:");
            for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
                System.out.println(constructor);
            }
            
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}