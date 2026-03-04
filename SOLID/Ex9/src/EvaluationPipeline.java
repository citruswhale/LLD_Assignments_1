public class EvaluationPipeline {
    private final Rubric rubric;
    private final PlagiarismChecker pc;
    private final ReportWriter writer;
    private final CodeGrader grader;

    public EvaluationPipeline(Rubric rubric, PlagiarismChecker pc, ReportWriter writer, CodeGrader grader) {
        this.rubric = rubric;
        this.pc = pc;
        this.writer = writer;
        this.grader = grader;
    }

    public void evaluate(Submission sub) {

        int plag = pc.check(sub);
        System.out.println("PlagiarismScore=" + plag);

        int code = grader.grade(sub, rubric);
        System.out.println("CodeScore=" + code);

        String reportName = writer.write(sub, plag, code);
        System.out.println("Report written: " + reportName);

        int total = plag + code;
        String result = (total >= 90) ? "PASS" : "FAIL";
        System.out.println("FINAL: " + result + " (total=" + total + ")");
    }
}
