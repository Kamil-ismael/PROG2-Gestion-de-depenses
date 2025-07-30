package Gestion_de_depenses;

import java.time.LocalDate;

public class RecurringExpense extends Expense {
    private String recurrence;

    public RecurringExpense(String label, double amount, LocalDate date, String recurrence) {
        super(label, amount, date);
        this.recurrence = recurrence;
    }

    @Override
    public String toString() {
        return "RecurringExpense{" +
                "recurrence='" + recurrence + '\'' +
                ", label='" + label + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
