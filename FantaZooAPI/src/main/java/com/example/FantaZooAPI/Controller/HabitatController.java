package com.example.FantaZooAPI.Controller;

import com.example.FantaZooAPI.Models.Habitat;
import com.example.FantaZooAPI.Repository.AnimalRepository;
import com.example.FantaZooAPI.Repository.HabitatRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/habitat")
public class HabitatController {

        private final HabitatRepository hr;

        HabitatController(HabitatRepository habitatRepository){
            this.hr = habitatRepository;
        }

        @GetMapping()
        List<Habitat> getAllHabitats(){
            return hr.findAll();
        }

        @GetMapping("/{id}")
        Habitat getHabitatById(@PathVariable int id){
            return hr.findById(id).get();
        }

        @PostMapping
        void insertHabitat(@RequestBody Habitat habitat){
            hr.save(habitat);
        }

        @PutMapping()
        void updateHabitat(@RequestBody Habitat habitat){
            hr.save(habitat);
        }

        @DeleteMapping("/id/{id}")
        void deleteHabitat(@PathVariable int id){
            hr.deleteById(id);

        }

}
