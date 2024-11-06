package Chapter29;

//시나리오 참고
//1. 바리스타는 아메리카노 주문 확인을 알린다.
//2. 바리스타는 물 500ml 와 원두 30g으로 아메리카노 커피를 만든다.
//3. 바리스타는 아메리카노 커피의 완성을 알린다.
public class Barista {

    //속성


    //행위
    public void noticeOrder(String coffeeName){
        System.out.println("바리스타: 커피주문을 확인 했습니다. 커피:" + coffeeName);

    }

    public Coffee makeUpCoffee(String coffeeName, long waterQuantity, long coffeeBeanQuantity){
        Coffee coffee = new Coffee(coffeeName, waterQuantity, coffeeBeanQuantity);
        return coffee;
    }
    public void sayCoffeeName(Coffee coffee){
        String coffeeName  = coffee.getCoffeeName();
        System.out.println("바리스타: 커피제작이 완료 되었습니다. 커피 :" + coffeeName);
    }

}
