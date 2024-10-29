package Chapter17;

public class Taxi {
    public static void main(String[] args) {

        //심야 할증 구간 0~4 시
        //시외 할증 기준 : 서울 x, 서울 외곽 0;
        int goHomeTime = 7;
        String myHome = "기흥";
        int payment = 10_000;

        if ( 0 < goHomeTime && goHomeTime < 4) {
            payment  = payment + (int) (payment * 0.2);
        }
        if ( myHome != "서울"){
            payment  = payment + (int) (payment * 0.2);
        }
        String result = String.format("고객님이 내셔야할 돈은 %d 입니다", payment);
        System.out.println(result);
    }
}
