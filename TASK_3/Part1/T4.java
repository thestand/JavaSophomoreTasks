import java.util.*;
public class T4{
	public static void main(String args[]){
		HashMap<String,String> dictionary = new HashMap<>();
		dictionary.put("apple","alma");
		dictionary.put("plum","orik");
		dictionary.put("potato","kartop");
		dictionary.put("lemon","limon");
		dictionary.put("pear","almurt");
		/* Find key-value pairs that have same length*/

    for (Map.Entry <String, String> entry : dictionary.entrySet()){
      if (entry.getKey().length() == entry.getValue().length()){
        System.out.printf("%s ==> %s\n", entry.getKey(), entry.getValue());
      }
    }
	}
}
