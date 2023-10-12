import javax.persistence.*;

@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductID")
    private Long productID;

    @Column(name = "Name")
    private String name;

    @Column(name = "Price")
    private double price;

    @Column(name = "QuantityInStock")
    private int quantityInStock;

    // Constructors, getters, and setters

    // Default constructor
    public Product() {
    }

    // Constructor without ID
    public Product(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    // Getters and setters for all fields
    // You can generate these using your IDE or write them manually
}
