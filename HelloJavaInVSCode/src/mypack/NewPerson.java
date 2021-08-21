package mypack;
public class NewPerson {
  protected String name;
  protected int age;
  protected float height;

  public NewPerson(String name, int age, float height) {
    this.name = name;
    this.age = age;
    this.height = height;
  }

  public void eat(String foodName) {
    System.out.println(this.name + " can eat " + foodName);
  }

  protected int getAge() {
    return this.age;
  }

  public float getHeight() {
    return this.height;
  }

  public String getName() {
    return this.name;
  }
}
