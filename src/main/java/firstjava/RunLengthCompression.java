package firstjava;

public class RunLengthCompression {
    public static void main(String[] args) {
        final var COUNTER_BASE = -1;
        var data = "abbcccbaaaabccccccccccccddd";
        var count = COUNTER_BASE;
        char prev = 0;
        var builder = new StringBuilder();
        for (var ch : data.toCharArray()) {
            if (prev == ch) {
                count++;
                if (count == 9) {
                    builder.append('9');
                    count = COUNTER_BASE;
                    prev = 0;
                }
            } else {
                if (count >= 0) {
                    builder.append((char) (count + '0'));
                    count = COUNTER_BASE;
                }
                builder.append(ch);
                prev = ch;
            }
        }
        if (count >= 0) {
            builder.append((char) ('0' + count));
        }
        var result = builder.toString();
        System.out.println(data);
        System.out.println(result);

        var ex1 = "aa0bcd1efg1gg0abc";
        var builder1 = new StringBuilder();
        var lower = true;

        for (char ch : ex1.toCharArray()) {
            switch (ch) {
                case '0' -> lower = false;
                case '1' -> lower = true;
                default -> {
                    if(lower) {
                        builder1.append(Character.toLowerCase(ch));
                    } else {
                        builder1.append(Character.toUpperCase(ch));
                    }
                }
            }
        }
        var result1 = builder1.toString();
        System.out.println(ex1);
        System.out.println(result1);

    }
}