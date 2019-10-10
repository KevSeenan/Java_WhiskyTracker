package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WhiskyRepository extends JpaRepository<Whisky, Long>, WhiskyRepositoryCustom {
//    Derived Queries - Always in the Repository
//    List<Whisky> getWhiskyByYear(int year);
//    List<Whisky> getWhiskyFromADistilleryByAge(Long distilleryId, int age);
}
