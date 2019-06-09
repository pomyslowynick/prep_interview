public class AreSame {
	
	public static boolean comp(int[] a, int[] b) {
  if (a == null || b == null) {
      return false;
    }
    else if (a.length == 0 && b.length == 0) {
      return true;
    }
    else if (a.length == 0 || b.length == 0) {
      return false;
    }
    for (int num : a) {
      boolean foundpair = false;
      for (int i = 0; i < b.length; i++) {
        if((num * num) == b[i]) {
          b[i] = 0;
          foundpair = true;
          break;
        }
      }
      if (!(foundpair)) return false;
    }
    return true;
  }
}