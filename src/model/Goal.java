package model;

import java.time.LocalDateTime;

public class Goal {
    private int id;
    private User user;
    private Category category;
    private String title;
    private String description;
    private double targetValue;
    private double currentValue;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String goalType;
    private String notificationConfig;

    public Goal() {}

    public Goal(User user, Category category, String title, String description,
                double targetValue, double currentValue, LocalDateTime startDate,
                LocalDateTime endDate, String goalType, String notificationConfig) {
        this.id = generateId();
        this.user = user;
        this.category = category;
        this.title = title;
        this.description = description;
        this.targetValue = targetValue;
        this.currentValue = currentValue;
        this.startDate = startDate;
        this.endDate = endDate;
        this.goalType = goalType;
        this.notificationConfig = notificationConfig;
    }

    public void updateProgress(double value) {
        System.out.println("Goal.updateProgress(): progresso atualizado");
    }

    public void completeGoal() {
        System.out.println("Goal.completeGoal(): meta concluída");
    }

    public void cancelGoal() {
        System.out.println("Goal.cancelGoal(): meta cancelada");
    }

    public void notifyUser() {
        System.out.println("Goal.notifyUser(): notificação enviada");
    }

    private static int generateId() {
        System.out.println("Goal.generateId(): gerando ID da meta");
        return 0;
    }
}
