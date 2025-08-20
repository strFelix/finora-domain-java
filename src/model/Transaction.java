package model;

import model.enums.TransactionType;

import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {
    private UUID id;
    private User user;
    private Category category;
    private Recurrence recurrence;
    private Local local;
    private double value;
    private LocalDateTime date;
    private String description;
    private TransactionType type;
    private int installment;
    private int quantityInstallments;
    private boolean isRecurring;

    public Transaction() {
    }

    public Transaction(User user, Category category, Local local,
                       double value, LocalDateTime date, String description, TransactionType type,
                       int installment, int quantityInstallments) {
        this.id = generateId();
        this.user = user;
        this.category = category;
        this.recurrence = null;
        this.local = local;
        this.value = value;
        this.date = date;
        this.description = description;
        this.type = type;
        this.installment = installment;
        this.quantityInstallments = quantityInstallments;
        this.isRecurring = false;
    }

    public void registerRecurrence(Recurrence recurrence) {
        System.out.println("Transaction.registerRecurrence(): recorrência registrada");
    }

    public void updateValue(double newValue) {
        System.out.println("Transaction.updateValue(): valor da transação atualizado");
    }

    public void changeCategory(Category newCategory) {
        System.out.println("Transaction.changeCategory(): categoria alterada");
    }

    public void changeLocal(Local newLocal) {
        System.out.println("Transaction.changeLocal(): local alterado");
    }

    public void updateDescription(String newDescription) {
        System.out.println("Transaction.updateDescription(): descrição atualizada");
    }

    public void markAsRecurring() {
        System.out.println("Transaction.markAsRecurring(): transação marcada como recorrente");
    }

    public void markAsNonRecurring() {
        System.out.println("Transaction.markAsNonRecurring(): transação marcada como não recorrente");
    }

    public void processInstallment() {
        System.out.println("Transaction.processInstallment(): parcela processada");
    }

    public void cancelTransaction() {
        System.out.println("Transaction.cancelTransaction(): transação cancelada");
    }

    private static UUID generateId() {
        System.out.println("Transaction.generateId(): gerando ID da transação");
        return UUID.randomUUID();
    }
}
