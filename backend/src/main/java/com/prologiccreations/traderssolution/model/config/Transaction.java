import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TransactionID")
    private Long transactionID;

    @Column(name = "Date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "Type")
    private String type; // e.g., Sale, Refund, Expense

    @Column(name = "Amount")
    private double amount;

    @Column(name = "Description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "EmployeeID")
    private Employee employee; // If applicable

    // Constructors, getters, and setters

    // Default constructor
    public Transaction() {
    }

    // Constructor without ID
    public Transaction(Date date, String type, double amount, String description, Employee employee) {
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.description = description;
        this.employee = employee;
    }

    // Getters and setters for all fields
    // You can generate these using your IDE or write them manually
}
