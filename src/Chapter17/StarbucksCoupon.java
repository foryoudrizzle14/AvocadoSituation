package Chapter17;

public class StarbucksCoupon {
    public static void main(String[] args) {

        //

        boolean clearCondition1 = true;
        boolean clearCondition2 = true;
        boolean clearCondition3 = false;
        boolean clearCondition4 = true;

        if (clearCondition1) {
            if (clearCondition2) {
                if (clearCondition3) {
                    if (clearCondition4) {
                        System.out.println("스타벅스 쿠폰 이벤트 신청 가능합니다.");


                    } else {
                        System.out.println("아니오, 내돈내산으로 커피 먹을게요");
                    }

                } else {
                    System.out.println("아니오, 내돈 내산으로 커피 먹을게요");
                }

            } else {
                System.out.println("아니오, 내돈내산으로 커피 먹겠어요. ");
            }
        }
    }
}
