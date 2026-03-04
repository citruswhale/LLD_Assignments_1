public class FakePlagiarismChecker implements PlagiarismChecker {
    @Override
    public int check(Submission s) {
        // fake score: lower is "better", but pipeline adds it anyway (smell)
        // Since output must remain unchanged, ignoring this Semantic mismatch/ unclear contract. Continuing this hardcoded logic for now.
        return (s.code.contains("class") ? 12 : 40);
    }
}
