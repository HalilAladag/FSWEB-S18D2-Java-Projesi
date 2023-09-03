package controller;


import entity.Vegetable;
import exceptions.PlantExceptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import services.VegetableService;

import java.util.List;

@RestController
@RequestMapping("/vegetables")
@Validated
public class VegetableController {
    private VegetableService vegetableService;

    @Autowired
    public VegetableController(VegetableService vegetableService ) {
        this.vegetableService = vegetableService;
    }



    @GetMapping("/")
    public List<Vegetable> findAllByPriceAsc(){
        return vegetableService.findAllByPriceAsc();
    }
    @GetMapping("/desc")
    public List<Vegetable> findAllByPriceDesc(){
        return vegetableService.findAllByPriceDesc();
    }

    @GetMapping("/{id}")
    public Vegetable find(@PathVariable int id){
        return vegetableService.find(id);
    }

    @PostMapping("/")
    public Vegetable save(@Validated @RequestBody Vegetable vegetable){
        return vegetableService.save(vegetable);
    }
    @PostMapping("/{name}")
    public List<Vegetable> save(@PathVariable String name){
        return vegetableService.searchByName(name);
    }
    @DeleteMapping("/{id}")
    public Vegetable delete(@PathVariable int id){
        Vegetable foundVegetable = vegetableService.find(id);
        if (foundVegetable==null){
            throw new PlantExceptions("Id can not found", HttpStatus.BAD_REQUEST);
        }
        vegetableService.delete(foundVegetable);
        return foundVegetable;
    }

}