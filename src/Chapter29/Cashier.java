package Chapter29;
//커피가격 확인하기
//답변해주기
//돈을 더하기
//주문을 알리기
//포장하기
//준비완료
public class Cashier {

    //속성
    private long salesAmount;

    //  행위
    public long checkCoffeePrice(String coffeeName){
        long price;
        switch(coffeeName){
                case "아메리카노":
                    price = 5000;
                    break;
                    case "카페라떼":
                 price = 6000;
                    break;
                case "카페모카":
                     price = 6500;
                 break;
                case "카푸치노":
                    price = 6000;
                    break;
                    default:
                        price = 0;
                        break;
        }
    }
}
