public class Condition {
  public static void main(String[] args) {
    int age = 15;
    if (age >= 18) {
      System.out.println("Tuổi: " + age + " - đã tốt nghiệp!");
    } else {
      System.out.println("Tuổi: " + age + " - chưa tốt nghiệp!");
    }

    int diemTrungBinh = 0;
    if (diemTrungBinh >= 9) {
      System.out.println("Great!");
    } else if (diemTrungBinh >= 7) {
      System.out.println("Good");
    } else if (diemTrungBinh >= 5) {
      System.out.println("Bad");
    } else {
      System.out.println("Worst!");
    }

    // switch case
    switch(diemTrungBinh) {
      case 10:
      case 9:
        System.out.println("Great!");
        break;
      case 8:
      case 7:
        System.out.println("Good!");
        break;
      case 6:
      case 5:
        System.out.println("Bad!");
      default:
        System.out.println("Worst!");
        break;
    }

    String result = "";
    result = age >= 18 ? "Đã tốt nghiệp" : "Chưa tốt nghiệp";

    System.out.println("result: " + result);
  }
}
