package com.example.FantaZooAPI.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Habitat {

    @Id
    int id;
    String name;
    Boolean bassin;

    @OneToMany
    List<Animal> animal;

    @OneToMany
    List<Zookeeper> zookeeper;

}
