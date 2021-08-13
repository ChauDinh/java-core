public class HelloWorld {
  public static void main(String[] args) {
    // Print Hello, world in the console
    System.out.println("Hello, world!");

    String name;
    int age; // Kiểu dữ liệu int (lưu trữ số nguyên) có giá trị lưu trữ 4byte khoảng từ -2^31 đến 2^31 - 1
    float height; // Kiểu dữ liệu float (lưu trữ số thực), 4 byte, có ký tự f ở cuối.

    name = "Chau Dinh";
    age = 26;
    height = 1.7f; //Kết thúc giá trị số thực phải có ký tự f

    System.out.print("Ten: ");
    System.out.println(name);
    System.out.print("Chieu cao: ");
    System.out.println(height);
    System.out.print("Tuoi: ");
    System.out.println(age);

    Boolean isDone = false;
    byte a = 100; // Kiểu dữ liệu byte (lưu trữ số nguyên) có giá trị lưu trữ 1 byte khoảng -2^7 = -128 đến 2^7 - 1= 127
    short b = 10000; // Kiểu dữ liệu short (lưu trữ số nguyên) có giá trị lưu trữ 2 byte -2^15 = -32768 đến 2^15 - 1= 32767
    long c = 1000000000l; // Kiểu dữ liệu long (lưu trữ số nguyên), 8byte, từ -2^63 đến 2^63 - 1 (cần có ký tự l ở cuối)
    double d = 3.4d; // Kiểu dữ liệu double (luuw trữ số thưc), 8 byte, có ký tự d ở cuối

    char str = 'A'; // Kiểu dữ liệu char (lưu trữ ký tự), 2byte, lưu trữ dạng unicode, hiển thị ra ký tự từ 'u0000' đến 'uffff'

    System.out.println(isDone);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(str);
  }
}