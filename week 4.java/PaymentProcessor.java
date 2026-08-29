// Base class and subclass setup
class FeeAccount { }
class HostelFeeAccount extends FeeAccount { }

public class PaymentProcessor {
    // Simple counters to track the batch
    private int hostelCount = 0;
    private int dayScholarCount = 0;

    void processPayment(FeeAccount account, double amount) {
        // Checking the most specific subclass first is good practice
        if (account instanceof HostelFeeAccount) {
            System.out.println("Paid in two installments (hostel account)");
            hostelCount++;
        } else if (account instanceof FeeAccount) {
            System.out.println("Paid in one go (day-scholar account)");
            dayScholarCount++;
        }
    }

    void printFinalSummary() {
        System.out.println("Hostel accounts processed: " + hostelCount + 
                           " | Day-scholar accounts processed: " + dayScholarCount);
    }

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        
        // Simulating the input array
        FeeAccount[] accounts = {
            new HostelFeeAccount(), 
            new HostelFeeAccount(), 
            new FeeAccount(), 
            new FeeAccount()
        };
        double amount = 60000;

        for (FeeAccount acc : accounts) {
            processor.processPayment(acc, amount);
        }
        
        processor.printFinalSummary();
    }
}