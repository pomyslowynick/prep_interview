import java.util.LinkedList;

public class SquareDigit {

  public int squareDigits(int n) {
    if(n == 0) {
      return 0;
    }
    int number = n;
    String strNumber = "";
    LinkedList<Integer> stack = new LinkedList<Integer>();
    while (number > 0) {
      stack.push( number % 10 );
      number = number / 10;
    }
    while(!(stack.isEmpty())) {
      int temp = stack.pop();
      temp = temp * temp;
      strNumber = strNumber + Integer.toString(temp);
    }
    return Integer.parseInt(strNumber);
  }

}