public class SizeConstrainedExporter extends Exporter {
    private final Exporter delegateExporter;
    private final int size;

    public SizeConstrainedExporter(Exporter delegateExporter, int size) {
        this.delegateExporter = delegateExporter;
        this.size = size;
    }

    @Override
    public ExportResult doExport(ExportRequest req) {
        if (req.body.length() > size) {
            throw new IllegalArgumentException("PDF cannot handle content > 20 chars");
        }

        return delegateExporter.doExport(req);
    }
}
