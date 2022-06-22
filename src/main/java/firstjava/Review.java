package firstjava;

import javax.swing.*;
import java.awt.image.BufferedImage;
import java.util.*;
import java.util.stream.IntStream;


public class Review {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int kg = in.nextInt();
        int qn = in.nextInt();
        int rk = in.nextInt();
        int vs = in.nextInt();
        int nt = in.nextInt();
        int pn = in.nextInt();

        System.out.print(1 - kg);
        System.out.print(" ");
        System.out.print(1 - qn);
        System.out.print(" ");
        System.out.print(2 - rk);
        System.out.print(" ");
        System.out.print(2 - vs);
        System.out.print(" ");
        System.out.print(2 - nt);
        System.out.print(" ");
        System.out.print(8 - pn);
    }
}





