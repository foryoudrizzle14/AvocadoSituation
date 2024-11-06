package Chapter29;
// 시나리오 참고
//'아메리카노 커피' 는 물 500ml와 원두 30g으로 만들어졌다.
//'아메리카노 커피' 는 테이크 아웃용으로 만들어졌다.

public class Coffee {
    // 속성

    private String CoffeeName;

    private long waterQuantity; //ml 단위

    private long coffeeBeanQuantity; //커피 원두의 양

    private boolean isWrappedUp;


    //행위
    void beWrappedUp() {
        this.isWrappedUp = true;
    }

    //생성자
    Coffee(String CoffeeName, long waterQuantity, long coffeeBeanQuantity) {
        this.CoffeeName = CoffeeName;
        this.waterQuantity = waterQuantity;
        this.coffeeBeanQuantity = coffeeBeanQuantity;
        isWrappedUp = false;
    }

    //

    public String getCoffeeName() {
        return CoffeeName;
    }
}
