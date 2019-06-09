import org.junit.Test;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;
import org.junit.Test;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    test();
  }
  public static double posAverage(String s) {
      int overallLength = 0;
      int similarities = 0;

      
      String[] splitted = s.split(", ");

      for(String countStr : splitted) {
        for(String countChar : countStr.split("")) {
          overallLength++;
        }
      }
      for(int i = 0; i < splitted.length; i++) {
        for(int y = 0; i < splitted.length; y++) {
          if(y == i) {
            y++;
            break;
          }
          String[] split1 = splitted[i].split("");
          String[] split2 = splitted[y].split("");
          // System.out.println(splitted[i] + " "+ splitted[y]);
          for(int z = 0; z < split1.length; z++) {
            // System.out.println(split1[z] + " " + split2[z]);
            if(split1[z].equals(split2[z])) {
              similarities = similarities + 1;
            }

          }
        }
      }

    System.out.println("similarities" + similarities + " " + overallLength);

    return similarities / overallLength;
  }


  private static void assertFuzzy(String s, double exp){
      System.out.println("Testing " + s);
      boolean inrange;
      double merr = 1e-9;
      double actual = posAverage(s);
      inrange = Math.abs(actual - exp) <= merr;
      if (inrange == false) {
          System.out.println("Expected mean must be near " + exp +", got " + actual);
      }
      assertEquals(true, inrange);         
  }
  @Test
  public static void test() {
      assertFuzzy("466960, 069060, 494940, 060069, 060090, 640009, 496464, 606900, 004000, 944096", 26.6666666667);
      assertFuzzy("444996, 699990, 666690, 096904, 600644, 640646, 606469, 409694, 666094, 606490", 29.2592592593);
      assertFuzzy("4444444, 4444444, 4444444, 4444444, 4444444, 4444444, 4444444, 4444444", 100);
      assertFuzzy("0, 0, 0, 0, 0, 0, 0, 0", 100);
  }
}


