package com.example.demo.planRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Plan;

public interface PlanRepo extends JpaRepository<Plan, Integer> {

}
