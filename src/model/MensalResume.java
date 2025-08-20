package model;

import java.util.List;

public class MensalResume {
    private int id;
    private String refMonth;
    private double totalEntry;
    private double totalExit;
    private List<Transaction> transactionsPerCategory;

    public MensalResume() {
    }

    public MensalResume(String refMonth, double totalEntry, double totalExit, List<Transaction> transactionsPerCategory) {
        this.id = generateId();
        this.refMonth = refMonth;
        this.totalEntry = totalEntry;
        this.totalExit = totalExit;
        this.transactionsPerCategory = transactionsPerCategory;
    }

    public void generateCurrentMonthResume(List<Transaction> transactions) {
        System.out.println("MensalResume.generateCurrentMonthResume(): resumo do mês atual gerado");
    }

    public void calculateTotals() {
        System.out.println("MensalResume.calculateTotals(): totais de entradas e saídas calculados");
    }

    public void groupByCategory() {
        System.out.println("MensalResume.groupByCategory(): transações agrupadas por categoria");
    }

    private static int generateId() {
        System.out.println("MensalResume.generateId(): gerando ID do resumo mensal");
        return 0;
    }
}
