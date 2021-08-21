public class Person {
  String name;
  int age;
  float height;

  public void eat() {
    System.out.println("Person can eat!");
  }

  public void eatParams(String foodName) {
    System.out.println(this.name + " can eat " + foodName);
  }

  public int getAge() {
    return this.age;
  }
}
