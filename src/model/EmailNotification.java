package model;

public class EmailNotification extends Notification {
    private String toEmail;
    private String fromEmail;
    private String subject;

    public EmailNotification() {
        super();
    }

    public EmailNotification(User user, String toEmail, String fromEmail, String subject, String title, String message) {
        super(user, title, message);
        this.toEmail = toEmail;
        this.fromEmail = fromEmail;
        this.subject = subject;
    }

    @Override
    public void send() {
        System.out.println("EmailNotification.send(): email enviado para " + toEmail);
    }

    public void preview() {
        System.out.println("EmailNotification.preview(): visualização do email gerada");
    }
}
