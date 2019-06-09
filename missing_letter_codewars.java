import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    exampleTests();
  }
  public static char findMissingLetter(char[] array)
  {
      if(array.length == 0) {
        return ' ';
      }
      char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
      char[] alphabetUpper = "abcdefghijklmnopqrstuvwxyz".toUpperCase().toCharArray();
      
      if(Character.isUpperCase(array[0])) {
        int i = 0;
        int y = 0;
        while(array[0] != alphabetUpper[i]) {
          i++;
        }
        while(array[y] == alphabetUpper[i]) {
          y++;
          i++;
        }
        return alphabetUpper[i];
      }else {
        int i = 0;
        int y = 0;
        while(array[0] != alphabet[i]) {
          i++;
        }
        while(array[y] == alphabet[i]) {
          y++;
          i++;
        }
        return alphabet[i];
      }
  }
  public static void exampleTests() {
        assertEquals('e', findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', findMissingLetter(new char[] { 'O','Q','R','S' }));
    }
  
}

