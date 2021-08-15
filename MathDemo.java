public class MathDemo {
  public static void main(String[] args) {
    int a = 5, b = 7, c = 10;
    int max = Math.max(a, b);
    max = Math.max(max, c);
    int min = Math.min(a, b);
    System.out.println("Max number: " + max);
    System.out.println("Min number: " + min);

    int d = -100;
    d = Math.abs(d);
    System.out.println(d);

    int e = 16;
    System.out.println(Math.sqrt(e));

    int f = 2;
    System.out.println(Math.pow(f, 3));

    double g = 12.45, h = 15.87;
    System.out.println(Math.ceil(g));
    System.out.println(Math.ceil(h));
    System.out.println(Math.floor(g));
    System.out.println(Math.floor(h));
    System.out.println(Math.round(g));
    System.out.println(Math.round(h));

    System.out.println(Math.random());
    
    // Random number from a to b
    // Math.random() * (b - a + 1) + a
    // ex: 5 -> 10
    for (int i = 0; i < 100; i++) {
      System.out.println(Math.random() * (10 - 5 + 1) + 5);
    }
  }
}
