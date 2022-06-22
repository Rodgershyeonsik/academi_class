package firstjava;

import java.util.ArrayList;
import java.util.List;

public class ForEachListSample {
    public static void main(String[] args) {
        var strs = List.of("apple", "grape", "watermelon");
        for (String str : strs) {
            System.out.println(str);
        }
        var names = List.of("gildong", "soonshin", "imdang");
        for (String name : names) {
            System.out.println(name);
        }
        var nums = new int[]{2, 3, 4, 5};
        for (int num : nums) {
            System.out.println(num);
        }

        var data = List.of("홍길동외전", "이순신 전기", "신사임당");

        var result = new ArrayList<String>();
        for (var s : data) {
            if (s.length() >= 5) {
                result.add(s);
            }
        }
        System.out.println(result);

        }
    }

