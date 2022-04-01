
public class RepeatingCharacters {
  public static void main(String args[]) {
    String name = "vivvekk";
    for (int i = 0; i < name.length() - 1; i++) {
      if (name.charAt(i) == name.charAt(i + 1)) {
        System.out.println("Repeating char" + name.charAt(i));
      }
    }
    System.out.println("Hello, World!");
  }
}
