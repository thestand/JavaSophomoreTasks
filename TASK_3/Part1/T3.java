
import java.util.*;

public class T3{
	public static void main(String args[]){
		ArrayList<String> places = new ArrayList<String>(Arrays.asList("Almaty","Astana","Karagandy","Atyrau","Zhezkazgan"));
		/* Sorted cities by word length*/
    Collections.sort(places, new Comparator<String>(){ 
      public int compare(String first, String second){
        return first.length() < second.length() ? -1 : first.length() == second.length() ? 0 : 1;
      }
    });
  System.out.println(places);
	}
}
