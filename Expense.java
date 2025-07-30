package Gestion_de_depenses;

import java.time.LocalDate;

public class Expense {
    String label;
    double amount;
    LocalDate date;

    public Expense(String label, double amount, LocalDate date) {
        this.label = label;
        this.amount = amount;
        this.date = date;
    }

    public String getLabel() {
        return label;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "label='" + label + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }

    public boolean isLargesExpense( double amount){
        return amount > 100.0;
    }
}
