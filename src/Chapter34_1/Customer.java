package Chapter34_1;

public class Customer {
    //속성

    static int serialNums = 1;

    private String customerID;
    private String name;
    private String customerGrade;

    private int bonusPoint;

    private double bonusPointRatio;



    //행위
    public int calculatePrice(int price){
        this.bonusPoint +=  price * bonusPointRatio;
        return price;
    }

    Customer(String name){
            this.customerID = "Customer" + serialNums++;
            this.name = name;
            this.customerGrade = "SILVER";
            this.bonusPointRatio = 0.01;
            this.bonusPoint = 0;

    }
}
