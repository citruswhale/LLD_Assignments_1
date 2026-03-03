public abstract class NotificationSender {
    protected final AuditLog audit;

    protected NotificationSender(AuditLog audit) {
        this.audit = audit;
    }

    public final void send(Notification n) {
        if (n == null || n.body == null) {
            throw new IllegalArgumentException("Invalid notification");
        }

        validate(n);
        doSend(n);
        audit.add(channelName() + " sent");
    }
    protected abstract void validate(Notification n);
    protected abstract void doSend(Notification n);
    protected abstract String channelName();
}
