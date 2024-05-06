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
public class Zookeeper {

    @Id
    int id;
    String name;
    String race;

    @ManyToOne
    Habitat habitat;

}
