package top.ss007.learn.java;


import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static top.ss007.learn.kotlin.constructs.LangStructsKt.calculate;

public class Main {
    public static void main(String[] args)  {
        System.out.println("hello world");

        Student student = new Student();
        student.setName("ShuSehng007");
        student.setAge(18);
        System.out.println(student.toString());

        List<String> list= new ArrayList<String>();

        lastIndex(list);

    }

    public static final <T>int lastIndex(@NotNull List<T> list){
        Objects.requireNonNull("list 不能为null");
        return list.size()-1;
    }


    public static void callKotlinFromJava() throws Exception{
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
