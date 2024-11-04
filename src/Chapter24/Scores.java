package Chapter24;

public class Scores {

    public static void main(String[] args) {
        //A CLASS 학생들 점수
        int studentAClass1 = 50;
        int studentAClass2 = 30;
        int studentAClass3 = 45;

        //B CLASS 학생들 점수
        int studentBClass1 = 60;
        int studentBClass2 = 65;
        int studentBClass3 = 66;

        //average

        int sumACLass1 = studentAClass1 + studentAClass2 + studentAClass3;
        double averageACLass1 = sumACLass1 / (double) 3;

        int sumBcLass1 = studentBClass1 + studentBClass2 + studentBClass3;
        double averageBcLass1 = sumBcLass1 / (double) 3;

        System.out.printf("A 학급의 평균점수는 %.2f, B학급의 평균은 %.2f\n ", averageACLass1, averageBcLass1);

    }
}
