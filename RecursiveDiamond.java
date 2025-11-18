/*
  The main method calls printPattern method which calls the printLine method.
  The printLine method calls printStars method which prints the characters(stars).
  In the print pattern method, it calls itslef to print the top half of the pattern.
  Then calls printLine to print the bottom half of the pattern. 
*/
public class RecursiveDiamond{
  public static void main(String[] args){
    int rows = 11;
    System.out.println("************************");
    printPattern(0, rows);
    System.out.println("************************");
  }
  static void printPattern(int i, int rows){
    printLine(i, row);

    if(i < rows - 1){
      printPattern(i + 1, rows); //recursive call
    }

    if(i < rows - 1){
      printLine(i, rows);
    }
  }
  static void printLine(iny i, int rows){
    int leftStars = rows - i;
    int rightStars = leftStars;

    if(i == 0){
      printStars('*', leftStars);
      printStars(' ', 3);
      printStars('*', rightStars);
    }else {
      int centerStars = 2 * i - 1;

      printStars('*', leftStars);
      printStars(' ', 2);
      printStars('*', centerStars);
      printStars(' ', 2);
      printStars('*', rightStars);
    }
  }
  static void printStars(char c, int count){
    for(int x = 0; x < count; x++)
      System.out.print(c);
  }
}
