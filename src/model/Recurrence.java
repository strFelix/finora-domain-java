package model;

import model.enums.Frequency;
import model.enums.RecurrenceType;
import java.time.LocalDate;

public class Recurrence {
    private int id;
    private User user;
    private Category category;
    private Local local;
    private String title;
    private String description;
    private double value;
    private RecurrenceType type;
    private Frequency frequency;
    private LocalDate refDate;
    private int totalOccurrences;
    private int remainingOccurrences;

    public Recurrence() {
    }

    public Recurrence(User user, Category category, Local local, String title, String description,
                      double value, RecurrenceType type, Frequency frequency, LocalDate refDate,
                      int totalOccurrences, int remainingOccurrences) {
        this.id = generateId();
        this.user = user;
        this.category = category;
        this.local = local;
        this.title = title;
        this.description = description;
        this.value = value;
        this.type = type;
        this.frequency = frequency;
        this.refDate = refDate;
        this.totalOccurrences = totalOccurrences;
        this.remainingOccurrences = remainingOccurrences;
    }

    public void activateRecurrence() {
        System.out.println("Recurrence.activateRecurrence(): recorrência ativada");
    }

    public void deactivateRecurrence() {
        System.out.println("Recurrence.deactivateRecurrence(): recorrência desativada");
    }

    public void updateRecurrence(String title, double value) {
        System.out.println("Recurrence.updateRecurrence(): recorrência atualizada");
    }

    public void processNextOccurrence() {
        System.out.println("Recurrence.processNextOccurrence(): próxima ocorrência processada");
    }

    private static int generateId() {
        System.out.println("Recurrence.generateId(): gerando ID da recorrência");
        return 0;
    }
}
