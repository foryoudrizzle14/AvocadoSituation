package Chapter19;

public class StarTree {

    public static void main(String[] args) {

        //
      int row;
      int column;

      for( row = 1; row <= 9 ; row++ ) {
          for( column = 1; column <= row; column++ ) {
              System.out.print("*");
          }
          System.out.println();
      }
    }
}