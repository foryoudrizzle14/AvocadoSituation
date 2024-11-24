package Chapter56;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        String data = "Hello, OutputStream!";

        try (FileOutputStream fos = new FileOutputStream("src/Chapter56/output.txt")) {
            // 문자열 데이터를 바이트 배열로 변환하여 출력
            fos.write(data.getBytes());
            System.out.println("데이터가 파일에 성공적으로 기록되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 쓰기 중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}

