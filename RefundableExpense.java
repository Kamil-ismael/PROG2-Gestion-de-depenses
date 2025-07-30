package Gestion_de_depenses;

import java.time.LocalDate;

public class RefundableExpense extends Expense {
    boolean refunded;

    public RefundableExpense(String label, double amount, LocalDate date, boolean refunded) {
        super(label, amount, date);
        this.refunded = refunded;
    }

    public boolean refund() {
       return refunded = true;

    }


}
