package controller;

import entity.Fruit;
import exceptions.PlantExceptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import services.FruitService;
 import java.util.List;

    @RestController
    @RequestMapping("/fruits")
    @Validated
    public class FruitController {
        private FruitService fruitService;

        @Autowired
        public FruitController(FruitService fruitService) {
            this.fruitService = fruitService;
        }

        @GetMapping("/")
        public List<Fruit> findAllByPriceAsc(){
            return fruitService.findAllByPriceAsc();
        }
        @GetMapping("/desc")
        public List<Fruit> findAllByPriceDesc(){
            return fruitService.findAllByPriceDesc();
        }

        @GetMapping("/{id}")
        public Fruit find(@PathVariable int id){
            return fruitService.find(id);
        }

        @PostMapping("/")
        public Fruit save(@Validated @RequestBody Fruit fruit){
            return fruitService.save(fruit);
        }
        @PostMapping("/{name}")
        public List<Fruit> save(@PathVariable String name){
            return fruitService.searchByName(name);
        }
        @DeleteMapping("/{id}")
        public Fruit delete(@PathVariable int id){
            Fruit foundFruit = fruitService.find(id);
            if (foundFruit==null){
                throw new PlantExceptions("Id can not found", HttpStatus.BAD_REQUEST);
            }
            fruitService.delete(foundFruit);
            return foundFruit;
        }

    }
