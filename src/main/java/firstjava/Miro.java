package firstjava;

import java.io.IOException;

public class Miro {
    public static int count = 1;

    public static void main(String[] args) throws IOException {
        record Position(int x, int y) {
        }
        int[][] map = {
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 0, 1, 0, 0, 1, 1},
                {1, 1, 0, 0, 0, 1, 1, 1},
                {1, 1, 0, 1, 0, 0, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1}
        };
        var current = new Position(2, 2); //현재 좌표 레코드 객체 만듦.
        var goal = new Position(5, 4); //goal 좌표 레코드 객체 만듦.
        for (; ; ) {
            ++count;
            for (int y = 0; y < map.length; y++) {

                for (int x = 0; x < map[y].length; x++) {
                    if (x == current.x() && y == current.y() && count % 2 == 0) {
                        System.out.print("o");
                    } else if (x == current.x() && y == current.y() && count % 2 != 0) {
                        System.out.print("O");
                    } else if(x <= current.y() + 2 && x >= current.y() - 2 &&
                              y <= current.x() + 2 && y >= current.x() - 2) {
                        if (map[y][x] == 1) {
                            System.out.print("*");
                        } else if (x == goal.x() && y == goal.y()) {
                            System.out.print("G");
                        } else {
                            System.out.print(".");
                        }
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }


            if (current.equals(goal)) {
                System.out.println("GOAL!");
                break;
            }

            int ch = System.in.read(); // 눌려진 방향    좌표    얻기
            var next = switch (ch) {
                case 'h' -> new Position(current.x() - 1, current.y());
                case 'u' -> new Position(current.x(), current.y() - 1);
                case 'j' -> new Position(current.x() + 1, current.y());
                case 'n' -> new Position(current.x(), current.y() + 1);
                default -> current;
            };

            if (map[next.y()][next.x()] == 0) {
                current = next;
            }
            System.in.read();
        }
    }
}