public class NewPerson {
  public String name;
  public int age;
  public float height;

  public NewPerson(String name, int age, float height) {
    this.name = name;
    this.age = age;
    this.height = height;
  }

  public void eat(String foodName) {
    System.out.println(this.name + " can eat " + foodName);
  }

  public int getAge() {
    return this.age;
  }

  public float getHeight() {
    return this.height;
  }

  public String getName() {
    return this.name;
  }
}
