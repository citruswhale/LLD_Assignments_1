public class SizeBasedMessageNormalizer {
    public static Notification normalize(Notification n, int size) {
        String body = n.body;
        if (body != null && body.length() > size) {
            body = body.substring(0, size);
        }

        return new Notification(n.subject, body, n.email, n.phone);
    }
}
