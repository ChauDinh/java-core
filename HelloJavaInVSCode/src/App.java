public class App {
    public static void main(String[] args) throws Exception {
        Person[] a = new Person[2];

        a[0] = new Person();
        a[1] = new Person();

        a[0].name = "Chau";
        a[0].age = 21;
        a[0].height = 1.7f;

        a[1].name = "Linh";
        a[1].age = 22;
        a[1].height = 1.55f;

        System.out.println(a[0].name);
        System.out.println(a[1].name);
    }
}
