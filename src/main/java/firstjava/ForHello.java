package firstjava;

public class ForHello {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        int i = 0;
        while(i < 5) {
            System.out.println(i);
            i++;
        }

        for (int j = 0; j < 5; j++) {
            if(j == 2) {
                System.out.println("skip");
                continue;
            }
            System.out.println(j);
        }
    }
}
