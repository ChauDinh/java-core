public class TypeCasting {
  public static void main(String[] args) {
    // int > long > double
    int age = 20;
    long lAge = age;
    double dAge = lAge;

    System.out.println("=====================");
    System.out.println("age: " + age);
    System.out.println("lAge: " + lAge);
    System.out.println("dAge: " + dAge);
    System.out.println("=====================");

    // double > int
    double total = 135.27d;
    int intTotal = (int) total;
    long longTotal = (long) total;
    float floatTotal = (float) total;
    short shortTotal = (short) total;
    byte byteTotal = (byte) total;

    System.out.println("total: " + total);
    System.out.println("intTotal: " + intTotal);
    System.out.println("longTotal: " + longTotal);
    System.out.println("floatTotal: " + floatTotal);
    System.out.println("shortTotal: " + shortTotal);
    System.out.println("byteTotal: " + byteTotal);
    System.out.println("=====================");
  }
}
