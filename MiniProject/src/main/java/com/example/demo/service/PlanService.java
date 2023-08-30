package com.example.demo.service;

import java.util.List;
import java.util.Map;

import com.example.demo.Entity.Plan;



public interface PlanService {
	
	public Map<Integer, String> getPlanCateogry();
	
	public boolean savePlan(Plan plan);
	
	public List<Plan> getAllPlans();
	
	public Plan getPlanById(Integer planeId);
	
	
	public boolean updatePlan(Plan plan);
	
	public boolean deletePlanById(Integer planId);
	
	public boolean planStatusChange(Integer PlanId, String status);
	

}
