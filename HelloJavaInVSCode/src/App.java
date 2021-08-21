import mypack.NewPerson;

public class App extends NewPerson {

    // Constructor 
    protected App(String name, int age, float height) {
        super(name, age, height);
    }

    public static void main(String[] args) throws Exception {
        
        App a = new App("Chau", 21, 1.7f);

        a.eat("Beaf");
        System.out.println(a.getAge());
        System.out.println(a.height);
    }
}
