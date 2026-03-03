public abstract class Exporter {
    public final ExportResult export(ExportRequest req) {
        if (req == null) {
            throw new IllegalArgumentException("Request cannot be null");
        }

        ExportResult result = doExport(req);

        if (result == null || result.bytes == null || result.contentType == null) {
            throw new IllegalStateException("Invalid export result");
        }

        return result;
    }

    public abstract ExportResult doExport(ExportRequest req);
}
