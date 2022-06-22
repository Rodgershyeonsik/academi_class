package firstjava;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.Socket;

public class SimpleClient {
    public static void main(String[] args) throws IOException {
        try {
            try (var sk = new Socket("localhost", 1979);
                 OutputStream os = sk.getOutputStream();) {
                os.write(123);
            }
        } catch (ConnectException e) {
            System.out.println("서버가 실행되지 않았습니다.");
        }
    }
}
