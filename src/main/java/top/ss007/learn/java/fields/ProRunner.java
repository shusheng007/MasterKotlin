package top.ss007.learn.java.fields;

public class ProRunner {

    public static void runJavaPropertyDemo() {
        JAnimal animal = new JDog();
        System.out.println(String.format("The weight of Java animal is %d", animal.weight));
    }
}
