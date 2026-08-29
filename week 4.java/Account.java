public class Account {
    private String regNo;
    private double totalFee;

    public Account(String regNo, double totalFee) {
        this.regNo = regNo;
        this.totalFee = totalFee;
    }

    // Locked method: cannot be overridden
    final double calculateLateFee(int daysLate) {
        return totalFee * (daysLate * 0.01); // 1% per day late based on sample output
    }

    // Locked method: handles the if-else branching for skipped accounts
    final void printSummary(int daysLate) {
        if (daysLate <= 0) {
            System.out.println(regNo + " - On time, no late fee");
        } else {
            System.out.println(regNo + " | Total Fee: Rs " + totalFee + 
                               " | Late Fee: Rs " + calculateLateFee(daysLate));
        }
    }

    public static void main(String[] args) {
        String[] regNos = {"RA001", "RA002", "RA003", "RA004"};
        double[] totalFees = {200000, 150000, 180000, 220000};
        int[] daysLate = {10, 0, -2, 5};

        for (int i = 0; i < regNos.length; i++) {
            Account acc = new Account(regNos[i], totalFees[i]);
            acc.printSummary(daysLate[i]);
        }
    }
}