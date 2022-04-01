import java.util.*;
public class MergeSort {
  public static void main(String args[]) {
    int[] a1=new int[]{12,44,25,7,6};
    int[] a2=new int[]{9,5,2,1};
    int[] m = new int[a1.length + a2.length];
    int i = 0, j = 0, k = 0;
    while (i < a1.length || j < a2.length) {
      if (a1[i] < a2[j]) {
        System.out.println("x" + a1[i]);
        m[k] = a1[i];
        k++;
        i++;
      } else {
        System.out.println("x" + a2[j]);
        m[k] = a2[j];
        k++;
        j++;
      }
    }
    Arrays.sort(m);
    for (int a: m)
      System.out.println(a);
    System.out.println("Hello, World!");
  }
}
