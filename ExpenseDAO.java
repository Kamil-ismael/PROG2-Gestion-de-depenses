import java.util.List;
import java.util.stream.Collectors;

public class ExpenseDAO {
    public List<RefundableExpense> getRefundableExpenses(List<RefundableExpense> expenses) {
        return expenses.stream()
                .filter(expense -> !expense.refunded)
                .collect(Collectors.toList());
    }

    public double getTotalRecurringExpenses(List<RecurringExpense> expenses) {
        return expenses.stream()
                .mapToDouble(Expense::getAmount)
                .sum();
    }


}
