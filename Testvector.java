import java.util.*;
class Testvector{
public static void main(String aa[]){
Vector v1= new Vector();
System.out.println(v1);
v1.addElement("Java");
v1.addElement(new Integer(2));
System.out.println(v1);
v1.addElement(new Integer(2));
System.out.println(v1);
v1.addElement(new StringBuffer("j2ee"));
System.out.println(v1.capcity());
System.out.println(v1.size());

System.out.println(v1.contain("javaa"));
}
}