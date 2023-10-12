import javax.persistence.*;
import java.lombok.*;


@Data
@Setter
@Getter
@Entity

public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SupplierID")
    private Long supplierID;

    @Column(name = "Name")
    private String name;


    // Constructors, getters, and setters

    // Default constructor
    public Supplier() {
    }

    // Constructor without ID
    public Supplier(String name) {
        this.name = name;
    }

    // Getters and setters for all fields
    // You can generate these using your IDE or write them manually
}
