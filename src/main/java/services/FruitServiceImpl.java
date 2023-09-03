package services;

import entity.Fruit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitServiceImpl implements FruitService{
    @Override
    public void addFruit(Fruit fruit) {

    }

    @Override
    public Fruit getFruitById(int id) {
        return null;
    }

    @Override
    public List<Fruit> getAllFruits() {
        return null;
    }

    @Override
    public void updateFruit(Fruit fruit) {

    }

    @Override
    public void deleteFruit(int id) {

    }

    @Override
    public List<Fruit> getFruitsByDesc() {
        return null;
    }

    @Override
    public List<Fruit> getFruitsByAsc() {
        return null;
    }

    @Override
    public List<Fruit> getFruitsByName(String name) {
        return null;
    }
}
