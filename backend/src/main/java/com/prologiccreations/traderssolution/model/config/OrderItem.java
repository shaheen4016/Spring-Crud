import javax.persistence.*;

@Entity
@Table(name = "OrderItem")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderItemID")
    private Long orderItemID;

    @ManyToOne
    @JoinColumn(name = "OrderID")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "ProductID")
    private Product product;

    @Column(name = "Quantity")
    private int quantity;

    @Column(name = "Subtotal")
    private double subtotal;

    // Constructors, getters, and setters

    // Default constructor
    public OrderItem() {
    }

    // Constructor without ID
    public OrderItem(Order order, Product product, int quantity, double subtotal) {
        this.order = order;
        this.product = product;
        this.quantity = quantity;
        this.subtotal = subtotal;
    }

    // Getters and setters for all fields
    // You can generate these using your IDE or write them manually
}
