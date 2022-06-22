package firstjava;

import java.util.List;

public class InterfaceSample2 {
    interface Named {
        String name();
    }

    interface Figure {
        int width();
        int height();
    }
    record Student(String name, int score) implements Named{}
    record Teacher(String name, String subject) implements Named{}
    record Staff(String name, String job) implements Named{}

    record Box(int width, int height) implements Figure{}
    record Oval(int width, int height) implements Figure{}

    public static void main(String[] args) {
        var people = List.of(new Student("sage", 88), new Teacher("hong", "math"));

        for(Named p: people) {
            var n = p.name();
            System.out.println("안녕하세요 %s 님".formatted(n));

        }

    }
}
