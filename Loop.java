public class Loop {
  public static void main(String[] args) {
    for (int i = 10, j = 1; i >= 1 && j <= 10; i--, j++) {
      System.out.println(i + " - " + j);
    }
    System.out.println("done!");

    // int i = 1;
    // while (i <= 10) {
    //   System.out.println("i: " + i);
    //   i++;
    // }

    // int i = 1;
    // do {
    //   System.out.println(i);
    //   i++;
    // } while (i <= 10);

    for (int i = 1; i <= 10; i++) {
      if (i == 4) {
        continue;
      };
      System.out.println(i);
    }
  }
}
