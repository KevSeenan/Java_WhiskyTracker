package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {

    //Custom queries always done in custom repo

    List<Whisky> getWhiskyByYear(int year);
    List<Whisky> getWhiskyFromADistilleryByAge(Long distilleryId, int age);
    List<Whisky> getWhiskyByRegion(String Region);
}
