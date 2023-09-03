package entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "fruits")
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private double price;

    @Enumerated(EnumType.STRING)
    private FruitType fruitType;

    public enum FruitType {
        SWEET,
        SOUR,
    }
}
