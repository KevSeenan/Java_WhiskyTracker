package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {

    List<Whisky> getWhiskyByYear(int year);
    List<Whisky> getWhiskyFromADistilleryByAge(Long id, int age);
    List<Whisky> getWhiskyByRegion(String Region);
}
