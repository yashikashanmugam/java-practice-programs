public class Logicaldemo {
    public static void main(String args[])
    {
        int a = 10;
        int b = 20;

        System.out.println((a < b) && (a > 5)); // AND
        System.out.println((a > b) || (a < b)); // OR
        System.out.println(!(a > b));           // NOT
    }
}
