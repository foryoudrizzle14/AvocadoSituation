package Chapter18;

public class WhileLoop {
//    public static void main(String[] args) {
//        // 1 ~10 까지를 다 더하는 whileloop
//        int sum = 0;
//        int num = 0;
//
//        while(num < 10) {
//            num = num + 1;
//            sum = sum + num;
//
//        }
//        String result = String.format("모든 수를 더한 값은 %d 입니다",sum);
//        System.out.println(result);
//    }

    public static void main(String[] args) {
        // 1 ~100 까지를 다 더하는 whileloop
        int sum = 0;
        int num = 0;

        while(num < 100) {
            num = num + 1;
//            System.out.println("나는 돌고있어 무한으로");//무한루프 알수 있는곳
            sum = sum + num;

        }
        String result = String.format("모든 수를 더한 값은 %d 입니다",sum);
        System.out.println(result);
    }
}
