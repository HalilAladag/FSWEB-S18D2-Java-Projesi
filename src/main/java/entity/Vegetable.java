package entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "vegetable", schema = "spring")
@Data
public class Vegetable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private double price;
    @Column(name = "is_grown_on_tree")
    private boolean isGrownOnTree;
}
