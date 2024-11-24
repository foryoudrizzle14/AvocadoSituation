package Chapter50;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("메인 메소드가 시작합니다.");

        makeUncheckException();

        System.out.println("메인 메소드가 종료합니디.");
    }

    public static void makeUncheckException() {
        int[] intArr = {1,2,3,4,5,6,7,8,9,10};
        int index = 10;

        System.out.println("값:" + intArr[index]);
    }

    public static void makeCheckException() throws FileNotFoundException {
        File file = new File("AvocadoSituation/chapter50/Test.txt");
//        FileInputStream fs  = new FileInputStream(file);

        System.out.println("FS 실행됩니다.");


    }
}
