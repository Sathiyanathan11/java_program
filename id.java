import java.util.*;
public class id {
	public static void main(String[] args) {
List<Integer> ids= new ArrayList<>();
 ids.add(8444);
 ids.add(8226);
 ids.add(8322);
 System.out.println("enter num");
 Scanner aa = new Scanner(System.in);
 Integer a1= aa.nextInt();
	 if(ids.contains(a1))
	 {
		 System.out.println("right");
	 }
	 else {
		 System.out.println("wrong");
	 }
}
}