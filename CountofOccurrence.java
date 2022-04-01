
import java.util.*;
public class CountofOccurrence {
  public static void main(String args[]) {
    ArrayList < String > list = new ArrayList < String > ();
    list.add("vivek");
    list.add("saravana");
    list.add("jaga");
    list.add("sanjay");
    list.add("saravana");
    list.add("sanjay");
    list.add("jaga");
    list.add("sanjay");
    list.add("saravana");
    list.add("jaga");

    Map < String, Integer > map = new TreeMap < String, Integer > ();
    for (String str: list) {
      Integer in = map.get(str);
      map.put(str, in == null ? 1 : in +1);
    }
    for (String key: map.keySet()) {
      System.out.println(key + " " + map.get(key));
    }
  }
}
