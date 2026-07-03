abstract class BankAccount {
    abstract void withdraw();
}

public class Abstraction extends BankAccount {

    void withdraw() {
        System.out.println("Withdrawal Successful");
    }

    public static void main(String[] args) {
        Abstraction s = new Abstraction();
        s.withdraw();
    }
}
