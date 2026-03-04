public class OutputPrinter {
    public static void printOutput(double km, String driver, String txn, BookingReceipt r) {
        System.out.println("DistanceKm=" + km);
        System.out.println("Driver=" + driver);
        System.out.println("Payment=PAID txn=" + txn);
        System.out.println("RECEIPT: " + r.id + " | fare=" + String.format("%.2f", r.fare));
    }
}
