public class JadenCase {

		public static String toJadenCase(String phrase) {
		if(phrase == null) {
		  return null;
		}else if (phrase.isEmpty()) {
		  return null;
		}
		else {
		  String[] splitStr = phrase.split(" ");
		  String finalString = "";
		  for(int i = 0; i < splitStr.length;i++){
		    String temp = splitStr[i].substring(0, 1).toUpperCase() + splitStr[i].substring(1);
		    if(i == splitStr.length - 1) {
		      finalString += temp;  
		    }else {
		      finalString += temp + " ";
		    }
		  }
		  return finalString;
    	}
	}

}