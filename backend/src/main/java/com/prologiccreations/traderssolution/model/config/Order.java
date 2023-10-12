import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderID")
    private Long orderID;

    @Column(name = "OrderDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;

    @Column(name = "TotalAmount")
    private double totalAmount;

    // Constructors, getters, and setters

    // Default constructor
    public Order() {
    }

    // Constructor without ID
    public Order(Date orderDate, double totalAmount) {
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

    // Getters and setters for all fields
    // You can generate these using your IDE or write them manually
}
