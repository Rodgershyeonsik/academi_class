package firstjava;

public class SwitchSample {
    public static void main(String[] args) {
        var a = 0;
        /*
        *  switch (a) {
            case 3 -> System.out.println("3");
            case 4 -> System.out.println("4");
            case 5 -> System.out.println("5");
            default -> System.out.println("기타");
        }
        * */

        System.out.println(switch(a) {
            case 1, 2 -> "1, 2";
            case 3 -> "3";
            case 4 -> "4";
            default -> "기타";
        });
    }
}
