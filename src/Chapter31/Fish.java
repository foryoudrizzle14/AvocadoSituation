package Chapter31;

public class Fish {

    String sex;
    boolean havingPoison;
    String StartSpawningDate;
    String endSpawningDate;
    String leavingSea;


    //행위
    void eat(String food){
        System.out.println("나: 물고기는 %s를 먹고 있습니다.\n", food);}
    void swim(int meter){System.out.println("나는 헤엄칩니다" + meter);}
    void makeCrowd(Fish otherfish){
        System.out.println("나는 다른 물고기와 무리짓습니다");
    }
    void sleep(){}
}
