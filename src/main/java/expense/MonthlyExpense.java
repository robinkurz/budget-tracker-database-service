package expense;

import javax.persistence.*;

@Entity
@Table(name = "monthly_expense")
public class MonthlyExpense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int amount;
    private String reason;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
