package com.example.FantaZooAPI.Controller;

import com.example.FantaZooAPI.Models.Zookeeper;
import com.example.FantaZooAPI.Repository.ZookeeperRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/zookeeper")
public class ZookeeperController {

    private final ZookeeperRepository zr;

    ZookeeperController(ZookeeperRepository zookeeperRepository){
        this.zr = zookeeperRepository;
    }

    @GetMapping()
    List<Zookeeper> getAllHabitats(){
        return zr.findAll();
    }

    @GetMapping("/{id}")
    Zookeeper getHabitatById(@PathVariable int id){
        return zr.findById(id).get();
    }

    @PostMapping
    void insertHabitat(@RequestBody Zookeeper habitat){
        zr.save(habitat);
    }

    @PutMapping()
    void updateZookeeper(@RequestBody Zookeeper habitat){
        zr.save(habitat);
    }

    @DeleteMapping("/{id}")
    void deleteZookeeper(@PathVariable int id){
        zr.deleteById(id);

    }

}
