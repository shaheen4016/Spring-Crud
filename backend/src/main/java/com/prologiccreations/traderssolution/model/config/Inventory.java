import javax.persistence.*;

@Entity
@Table(name = "Inventory")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "InventoryID")
    private Long inventoryID;

    @ManyToOne
    @JoinColumn(name = "ProductID")
    private Product product;

    @Column(name = "QuantityInStock")
    private int quantityInStock;

    // Constructors, getters, and setters

    // Default constructor
    public Inventory() {
    }

    // Constructor without ID
    public Inventory(Product product, int quantityInStock) {
        this.product = product;
        this.quantityInStock = quantityInStock;
    }

    // Getters and setters for all fields
    // You can generate these using your IDE or write them manually
}
