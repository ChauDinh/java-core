public class Array {
  public static void main(String[] args) {
    int[] a;
    a = new int[3];
    a[0] = 5;
    a[1] = 4;
    a[2] = 3;

    System.out.println(a);

    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }

    char[] b = {'C', 'H', 'A', 'U'};
    System.out.println(b);

    int[][] c = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println(c);
    for (int i = 0; i < c.length; i++) {
      for (int j = 0; j < c.length; j++) {
        System.out.print(c[i][j] + " ");
      }
      System.out.println();
    }
  }
}
