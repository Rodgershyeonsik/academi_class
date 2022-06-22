package firstjava;

public class MethodSample {
    public static void main(String[] args) {
        var result = twice(3);
        System.out.println(result);

        //메소드를 더 간결하게 만들어주는 것이 람다식이다..

    }


    static int twice(int x) {
        return x * 2;
    }
}
