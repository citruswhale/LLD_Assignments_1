public class OutputPrinter {
    public static void print(int plag, int code, String reportName, int total, String result) {
        System.out.println("PlagiarismScore=" + plag);
        System.out.println("CodeScore=" + code);
        System.out.println("Report written: " + reportName);
        System.out.println("FINAL: " + result + " (total=" + total + ")");
    }
}
