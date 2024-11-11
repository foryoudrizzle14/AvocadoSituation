package Chapter34_1;

public class Staff {

    //속성
    private int salesAmount;


    //행위
    public void calculatePrice(Customer customer) {
        int cash = customer.calculatePrice(price);
        addSalesAmount(cash);
    }

    public void addSalesAmount(int cash){
        salesAmount += cash;
    }
    public void printMySalesAmount(){
        System.out.println("오늘의 최종 매상은 " + this.salesAmount + "원 입니다");

    }
}

