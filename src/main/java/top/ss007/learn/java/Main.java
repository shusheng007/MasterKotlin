package top.ss007.learn.java;


import kotlin.jvm.functions.Function2;
import top.ss007.learn.kotlin.MainKt;


import static top.ss007.learn.kotlin.constructs.LangStructsKt.calculate;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");

        Student student = new Student();
        student.setName("ShuSehng007");
        student.setAge(18);
        System.out.println(student.toString());


    }


    public void callKotlinFromJava() {
        calculate(1, 2, new Function2<Integer, Integer, Integer>() {
            @Override
            public Integer invoke(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        });
    }

    public int javaCalculate(int x, int y, Fun2<Integer, Integer, Integer> operation) {
        return operation.invoke(x, y);
    }


}
