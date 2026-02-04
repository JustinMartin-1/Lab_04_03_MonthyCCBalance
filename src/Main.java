public class Main {
    public static void main(String[] args) {

        double startingBalance = 5000.0;
        double interestRate = 0.17;

        double monthOneInterest = startingBalance * interestRate;
        double monthOneBalance = startingBalance + monthOneInterest;

        double monthTwoInterest = monthOneBalance * interestRate;
        double monthTwoBalance = monthOneBalance + monthTwoInterest;

        System.out.println("Starting balance: $" + startingBalance);
        System.out.println("Interest after 1 month: $" + monthOneInterest);
        System.out.println("Balance after 1 month: $" + monthOneBalance);
        System.out.println("Interest after 2 months: $" + monthTwoInterest);
        System.out.println("Balance after 2 months: $" + monthTwoBalance);
    }
}
