public class Main {

    public static final double INTEREST_RATE = 0.17;
    public static void main(String[] args) {
        int cardBalance = 5000;
        double interestDue1 = 0;
        double interestDue2 = 0;


        interestDue1 = cardBalance * INTEREST_RATE;
        interestDue2 = ((cardBalance * INTEREST_RATE) + cardBalance) * INTEREST_RATE;
        System.out.printf("First month balance due is %.2f", interestDue1);
        System.out.printf("\n Second month balance due is %.2f" , interestDue2);
    }
}