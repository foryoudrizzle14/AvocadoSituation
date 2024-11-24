package Chapter56;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest { // 클래스 이름 수정
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/Chapter56/test.txt")) { // FileInputStream 생성자 수정
            int i;
            while ((i = fis.read()) != -1) { // 조건식 수정
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) { // FileNotFoundException 처리
            System.out.println("파일을 찾을 수 없습니다: " + e.getMessage());
        } catch (IOException e) { // IOException 처리
            System.out.println("파일 읽기 중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}
