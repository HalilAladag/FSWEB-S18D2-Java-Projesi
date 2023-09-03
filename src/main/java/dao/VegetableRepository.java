package dao;

import entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VegetableRepository extends JpaRepository <Vegetable, Integer> {

//    void addVegetable(Vegetable vegetable);
//    Vegetable getVegetableById(int id);
//    List <Vegetable> getAllVegetables();
//    void updateVegetable(Vegetable vegetable);
//    void deleteVegetable(int id);

    List<Vegetable> getVegetablesByDesc();
    List<Vegetable> getVegetablesByAsc();
    List<Vegetable> getVegetablesByName(String name);
}
