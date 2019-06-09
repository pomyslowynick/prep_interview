import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;
import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;


class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Test2();
  }

  public static int Test(String numbers) { 
    if(numbers == null) {
      return 0;
    }else if (numbers.length() == 0) {
      return 0;
    } else {
      List<Integer> arr = Arrays.stream(numbers.split(" ")).map(Integer::parseInt).map(n -> n % 2).collect(Collectors.toList());
      for(int someInt : arr) {
        System.out.println(someInt);

      }
      int firstElement = arr.get(0);
      for (int i = 1; i < arr.size(); i++) {
        if (arr.get(i) != firstElement && arr.get(i - 1) != firstElement) {
          return 1;
        }else if (arr.get(i) != firstElement) {
          return i + 1;
        }
      }
      return 1;
    }
        
  }

  public static void Test2()
    {
      assertEquals(1, Test("2 2 2 3"));
    }
}