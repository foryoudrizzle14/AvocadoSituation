package Chapter31;

public class FishChild extends Fish {


    private boolean eatable;
    public void digging(){
        System.out.println(myInfo() + "가 모래를 파고 있습니다.");
    }


    public boolean isEatable() {
        return eatable;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;

    }
}
