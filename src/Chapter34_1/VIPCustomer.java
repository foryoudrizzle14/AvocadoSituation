package Chapter34_1;

public class VIPCustomer {
    //속성
    static int serialNums = 1;

    private String customerID;
    private String name;
    private String customerGrade;

    private int bonusPoint;
    private double bonusPointRatio;


    private String agentId;
    private double discountRatio;


    //행위
    public int calculatePrice(int price){
        this.bonusPoint += price * bonusPointRatio;
        price -= price * discountRatio;
        return price;
    }

    public void callAgent(){
        System.out.println("당담직원" + this.agentID +"님 문의 드릴게 있어요.");
    }

    public VIPCustomer(String name){
        this.customerID = "VIP" + serialNums++;
        this.name = name;
        this.customerGrade = "VIP";
        this.bonusPoint = 0;
        this.bonusPointRatio = 0.05;
        this.discountRatio = 0.1;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }
}
