public class DataTypes {
  public static void main(String[] args) {
    boolean isValid = false;
    System.out.println(isValid);

    char character = 'A';
    System.out.println("First character: " + character);

    int age = 20;
    System.out.println("Age: " + age);

    final double PI = 3.14d;
    System.out.println("Pi: " + PI);

    System.out.println("Phạm vi của short: " + Short.MIN_VALUE + " ... " + Short.MAX_VALUE);

    int a = 33;
    int b = 34;
    int max = Integer.max(a, b);
    System.out.println("Max number: " + max);
  } 
}
