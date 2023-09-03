package dao;

import entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Integer> {
//    void addFruit(Fruit fruit);
//    Fruit getFruitById(int id);
//    List<Fruit> getAllFruits();
//    void updateFruit(Fruit fruit);
//    void deleteFruit(int id);
    @Query("SELECT f FROM Fruit f ORDER BY f.price desc")
    List<Fruit> getFruitsByDesc();

    @Query("SELECT f FROM Fruit f ORDER BY f.price asc")
    List<Fruit> getFruitsByAsc();

    @Query("SELECT f FROM Fruit f WHERE f.name ilike %:name%")
    List<Fruit> getFruitsByName(String name);
}
