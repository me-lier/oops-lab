import java.util.ArrayList; 
public class ArrayList2 {
    public static void main(String[] args){ ArrayList list = new ArrayList(); list.add(10);
list.add("hi");
list.add(true);
list.add("hello");
list.add(20);
System.out.println(list);
//Output : [10, hi, true, hello, 20]
//Getting the index of first occurrence of "true"
System.out.println(list.indexOf(true)); //Output : 2
        //Getting the index of last occurrence of "20"
System.out.println(list.lastIndexOf(20)); //Output : 4
} }