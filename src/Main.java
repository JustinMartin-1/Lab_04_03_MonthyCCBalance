public class Main {
    public static void main(String[] args) {

        double balance = 5000.0;
        double interestRate = 0.17;

        double monthlyInterest = balance * interestRate;
        balance += monthlyInterest;

        System.out.println("Balance after 1 month: $" + balance);
        monthlyInterest = balance * interestRate;
        balance += monthlyInterest;
        System.out.println("Balance after 2 months: $" + balance);
    }
}
