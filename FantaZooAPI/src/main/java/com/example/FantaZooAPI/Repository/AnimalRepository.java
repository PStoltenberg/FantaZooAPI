package com.example.FantaZooAPI.Repository;

import com.example.FantaZooAPI.Models.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
}
