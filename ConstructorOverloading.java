public class ConstructorOverloading {

    ConstructorOverloading() {
        System.out.println("Default Constructor");
    }

    ConstructorOverloading(String name) {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        ConstructorOverloading s1 =
            new ConstructorOverloading();

        ConstructorOverloading s2 =
            new ConstructorOverloading("Yashika");
    }
}
