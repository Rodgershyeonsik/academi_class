package firstjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamSample2 {
    public static void main(String[] args) {
        var data = List.of("홍길동외전", "이순신 전기", "신사임당");

        var result = (int) data.stream().filter(s -> s.length() >= 5).count();
        System.out.println(result);

        String str = null;
        Optional<String> strOpt = Optional.ofNullable(str);
        if(strOpt.isPresent()) {
            String msg = strOpt.get();
            System.out.println(msg.length());
        }
        System.out.println("*********");
        strOpt.ifPresent(v -> System.out.println(v.length()));
        //값을 받는 경우
        Optional<String>strOpt2 = Optional.ofNullable(str);
        Optional<Integer> lengthOpt = strOpt2.map(v->v.length());
    }
}
