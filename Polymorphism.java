public class Polymorphism {

    void balance() {
        System.out.println("Balance Checked");
    }

    void balance(int amount) {
        System.out.println("Balance: " + amount);
    }

    public static void main(String[] args) {
        Polymorphism p = new Polymorphism();
        p.balance();
        p.balance(5000);
    }
}