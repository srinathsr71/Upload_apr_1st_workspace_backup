import java.util.HashSet;
import java.util.Iterator;

public class cha6 {
    public static void main(String[] args) {
HashSet<String> countries= new HashSet<String>();
countries.add("India");
countries.add("SriLanka");
countries.add("N.America");
countries.add("S.America");
countries.add("Australia");
countries.add("Netherlands");
countries.add("Russia");
countries.add("Dubai");
countries.add("Sweden");
countries.add("Canada");
countries.add("Canada");
countries.add("Germany");
System.out.println("Using Iterator");
System.out.println("--------------");
//Iterator itr=countries.iterator();
// while(itr.hasNext()){
//     System.out.println(itr.next());
// }
for(String g:countries){
    System.out.println(""+g);

}
    
}
}