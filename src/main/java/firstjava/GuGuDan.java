package firstjava;

public class GuGuDan {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println();
        }

        for (int i = 5; i > 0; i--) {
            System.out.print("0".repeat(i));
            System.out.println();
        }
    }
}
