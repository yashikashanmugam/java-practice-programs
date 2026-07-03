public class ParameterizedConstructor {

    ParameterizedConstructor(String name) {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        ParameterizedConstructor s =
            new ParameterizedConstructor("Yashika");
    }
}
