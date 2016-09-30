
import java.util.*;
public class T1{
	public static void main(String args[]){
		ArrayList<Student> students = new ArrayList<>();
		Student s = new Student();
    s.name = "John";
    s.surname = "Jhohnson";
    students.add(s);
	}
}
class Student{
	String name,surname;
  
  public String toString(){
    return name.charAt(0) + ". " + surname;
  }
}
