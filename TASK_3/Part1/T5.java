
import java.util.*;

public class T5{
	public static void main(String args[]){
		ArrayList<String> languages = new ArrayList<>(Arrays.asList("kazakh","russian","turkish","french"));
		ArrayList<String> languages2 = new ArrayList<>(Arrays.asList("russian","kazakh","english","farsi"));
		/* Remove all words from list1, that exists in list2 */

    Iterator <String> it = languages.iterator();
    while (it.hasNext()){
      String next = it.next();
      if (languages2.contains(next)) it.remove();
    }
    System.out.println(languages);
	}
}
