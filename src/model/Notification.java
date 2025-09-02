package model;

import java.time.LocalDateTime;

public abstract class Notification {
    protected int id;
    protected User user;
    protected String title;
    protected String message;
    protected LocalDateTime createdAt;
    protected boolean delivered;

    public Notification() {
        this.id = generateId();
        this.createdAt = LocalDateTime.now();
        this.delivered = false;
    }

    public Notification(User user, String title, String message) {
        this.id = generateId();
        this.user = user;
        this.title = title;
        this.message = message;
        this.createdAt = LocalDateTime.now();
        this.delivered = false;
    }

    public abstract void send();

    public void schedule(LocalDateTime when) {
        System.out.println("Notification.schedule(): notificação agendada para " + when);
    }

    public void cancel() {
        System.out.println("Notification.cancel(): notificação cancelada");
    }

    private static int generateId() {
        System.out.println("Notification.generateId(): gerando ID da notificação");
        return 0;
    }
}
