package firstjava;

import java.util.List;

public class MethodIntStream {
    public static void main(String[] args) {
        var names = List.of("홍길동", "이순신", "신사임당");
        names.forEach(System.out::println);
        names.stream().map(String::toUpperCase).toList();
        names.stream().map("%s님"::formatted).toList();
        names.stream().map(s -> s.toLowerCase()).toList();

        loop(3);
    }
    static void loop(int i) {
        if(i == 0) {
            return;
        }
        System.out.println(i);
        i--;
    }
}
