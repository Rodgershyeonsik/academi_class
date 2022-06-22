package firstjava;

import java.util.Arrays;

public class RemoveDuplicate2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        var builder = new StringBuilder();

        if (arr.length % 2 == 1) {
            for (int i = 0; i < arr.length - 1; i++) {
                    int curr = arr[i];
                    int next = arr[i + 1];

                    builder.append(curr + next);
                    curr = next;
                }
            builder.append(arr[arr.length - 1]);
            } else {
            for (int i = 1; i < arr.length - 1; i++) {
                if (i % 2 == 0) {
                    continue;
                } else {
                    int curr = arr[i];
                    int next = arr[i + 1];

                    builder.append(curr + next);
                    curr = next;
                }
            }
        }
        var result = builder.toString();
        System.out.println(Arrays.toString(arr));
        System.out.println(result);
    }


}
