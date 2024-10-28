package Chapter16;

public class AvocadoSituation {

    public static void main(String[] args) {
        //장보기 전,

        int milks = 0;
        int avocados = 0;
        boolean existedAvocado = true;

        //장보기
        milks = 1;
        if (existedAvocado) {
            avocados = avocados + 6;
        }

        //집으로 돌아오기
        String comment = String.format("장보고 돌아왔어 %d개 아보카도, %d개 우유 사왔어", avocados, milks);
        System.out.println(comment);
    }
}