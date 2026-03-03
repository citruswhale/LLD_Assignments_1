import java.nio.charset.StandardCharsets;

public class CsvExporter extends Exporter {

    private String escape(String s) {
        if (s == null) return "";
        return s.replace("\n", " ").replace(",", " ");
    }

    @Override
    public ExportResult doExport(ExportRequest req) {
        String csv = "title,body\n" + req.title + "," + escape(req.body) + "\n";
        return new ExportResult("text/csv", csv.getBytes(StandardCharsets.UTF_8));
    }
}