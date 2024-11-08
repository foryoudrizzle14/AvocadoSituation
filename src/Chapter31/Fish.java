package Chapter31;

public class Fish {

    private String sex;
    private boolean havingPoison;
    private String StartSpawningDate;
    private String endSpawningDate;
    String leavingSea;


    //행위
    void eat(String food){
        System.out.printf("나, 물고기는 %s를 먹고 있습니다.\n", food);}
    void swim(int meter){System.out.println("나는 헤엄칩니다" + meter);}
    void makeCrowd(Fish otherfish){
        System.out.println("나는 다른 물고기와 무리짓습니다");
    }
    void sleep(){}

    String myInfo(){
        return String.format("물고기(sex=%s, havingPoison=%s, leavingSea=%s)\n" , this.sex,
                this.havingPoison, this.leavingSea);
    }


    void printfMyInfo(){
        System.out.println(myInfo());
    }


    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setHavingPoison(boolean havingPoison) {
        this.havingPoison = havingPoison;
    }

    public void setStartSpawningDate(String startSpawningDate) {
        StartSpawningDate = startSpawningDate;
    }

    public void setEndSpawningDate(String endSpawningDate) {
        this.endSpawningDate = endSpawningDate;
    }

    public void setLeavingSea(String leavingSea) {
        this.leavingSea = leavingSea;
    }
}
