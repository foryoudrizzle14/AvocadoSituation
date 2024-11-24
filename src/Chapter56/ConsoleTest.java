package Chapter56;

import java.io.IOException;

public class ConsoleTest {
    public static void main(String[] args) {
        System.out.println("입력값을 넣어주세요");

        try {
            StringBuilder sb = new StringBuilder();
            int i; // boolean 대신 int 사용
            while ((i = System.in.read()) != '\n') { // 괄호 닫음
                sb.append((char) i);
            }
            System.out.println("String 출력: " + sb);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // System.out.println("i 그대로 출력: " + i);
        // System.out.println("1 그대로 출력: " + (char) i);
    }
}