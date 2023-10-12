import javax.persistence.*;

@Entity
@Table(name = "Category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CategoryID")
    private Long categoryID;

    @Column(name = "Name")
    private String name;

    // Constructors, getters, and setters

    // Default constructor
    public Category() {
    }

    // Constructor without ID
    public Category(String name) {
        this.name = name;
    }

    // Getters and setters for all fields
    // You can generate these using your IDE or write them manually
}
