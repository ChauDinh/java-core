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

    // Strings, substrings, concatenation

    String greeting = "Hello";
    String s = greeting.substring(0, 3);
    System.out.println(s);
    // the length of substring s is b - a

    String all = String.join("/", "S", "M", "L", "XL");
    System.out.println(all);

    String repeated = "Java".repeat(3);
    System.out.println(repeated);

    // Strings are immutable
    greeting = greeting.substring(0, 3) + "p!";
    System.out.println(greeting);

    System.out.println("Hello".equals(greeting));
    System.out.println("Help!".equals(greeting));
    System.out.println("help!".equalsIgnoreCase(greeting));
    System.out.println("Help!" == greeting);

    System.out.println(greeting.length() == 0);
    System.out.println(greeting.equals(""));
    System.out.println(greeting == null);

    if (greeting != null && !greeting.equals("")) {
      System.out.println(greeting);
    }

    if (greeting != null && greeting.length() != 0) {
      System.out.println(greeting);
    }

    int cpCount = greeting.codePointCount(0, greeting.length());
    System.out.println(cpCount);

    char first = greeting.charAt(0);
    char last = greeting.charAt(greeting.length() - 1);
    System.out.println(first + " " + last);

    int index = greeting.offsetByCodePoints(0, 2);
    int cp = greeting.codePointAt(index);
    System.out.println(cp);
  }
}
