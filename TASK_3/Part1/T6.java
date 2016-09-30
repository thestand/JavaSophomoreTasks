
import java.util.*;

public class T6{
	public static void main(String args[]){
		LinkedList<String> languages = new LinkedList<>(Arrays.asList("kazakh","russian","turkish","french"));
		LinkedList<String> languages2 = new LinkedList<>(Arrays.asList("russian","kazakh","english","farsi"));
		/* Remove all words from list1, that exists in list2, 
		 * but if some words doesn't exist in list1, 
		 * but exist in list2, should be added to list1 */
    for (int i = 0; i < languages.size(); i ++){
      if (languages2.contains(languages.get(i))){
        languages2.set(languages2.indexOf(languages.get(i)), "x");
        languages.set(i, "x");
      }
    }
    
    Iterator it = languages.iterator();
    while (it.hasNext()){
 //     System.out.println(it.next());
      if (it.next() == "x") it.remove();
    }

    for (int i = 0; i < languages2.size(); i ++){
      if (languages2.get(i) != "x") languages.add(languages2.get(i));
    }
    System.out.println(languages);
    
  }
}

