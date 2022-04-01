
public class PasswordValidation {
  public static void main(String args[]) {
    String name = "qq";
    int length = name.length();
    boolean isValid = true;
    int errorcode = 0;
    if (errorcode == 0 && length < 8 || length > 31) {
      System.out.println("length validation failed");
      errorcode = 10;
      isValid = false;
    }

    boolean isupper = false;

    boolean islower = false;

    boolean isdigit = false;
    if (errorcode == 0 ){
    for (char c: name.toCharArray()) {

      if (Character.isUpperCase(c))
        isupper = true;

      if (Character.isLowerCase(c))
        islower = true;

      if (Character.isLowerCase(c))
        isdigit = true;

    }
    if (!(isupper && islower && isdigit)) {
      errorcode = 20;
    }}
     if (errorcode == 0 ){
    for (int i = 0; i < name.length() - 1; i++) {

      if (name.charAt(i) == name.charAt(i + 1)) {
        errorcode = 40;
        
      }}
    }
     
    System.out.println("Error Code:" + errorcode);
  }
}
