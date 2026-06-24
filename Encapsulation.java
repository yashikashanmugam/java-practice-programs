public class Encapsulation {

    private int balance = 10000;

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Encapsulation b = new Encapsulation();
        System.out.println("Balance: " + b.getBalance());
    }
}
