package com.example.FantaZooAPI.Controller;


import com.example.FantaZooAPI.Models.Animal;
import com.example.FantaZooAPI.Repository.AnimalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animal")
public class AnimalController {

    private final AnimalRepository ar;

    AnimalController(AnimalRepository animalRepository){
        this.ar = animalRepository;
    }

    @GetMapping()
    List<Animal> getAllAnimals(){
        return ar.findAll();
    }

    @GetMapping("/{id}")
    Animal getAnimalById(@PathVariable int id){
        return ar.findById(id).get();
    }

    @PostMapping
    void insertAnimal(@RequestBody Animal animal){
        ar.save(animal);
    }

    @PutMapping()
    void updateAnimal(@RequestBody Animal animal){
        ar.save(animal);
    }

    @DeleteMapping("/{id}")
    void deleteAnimal(@PathVariable int id){
        ar.deleteById(id);

    }
}
