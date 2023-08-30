package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Plan;
import com.example.demo.Entity.PlanCateogry;
import com.example.demo.planRepo.PlanRepo;
import com.example.demo.planRepo.PlanCateogryRepo;

@Service
public class PlanServiceImpl implements PlanService {

	@Autowired
	private PlanRepo planRepo;

	@Autowired
	private PlanCateogryRepo planCatrogryRepo;

	@Override
	public Map<Integer, String> getPlanCateogry() {
	 List<PlanCateogry> categories = planCatrogryRepo.findAll();
		
		Map <Integer,String> categoryMap = new HashMap<>();
		
		categories.forEach(categroy -> {
			categoryMap.put(categroy.getCateogryId(), categroy.getCateogryName());		
		});
		return categoryMap;
	}

	@Override
	public boolean savePlan(Plan plan) {
		
		Plan saved = planRepo.save(plan);
		if(saved.getPlanId()!= null)
		{
			return true;
		}
		else
		{
			return  false;
		}
	}

	@Override
	public List getAllPlans() {
		// TODO Auto-generated method stub
		return planRepo.findAll();
		
	}

	@Override
	public Plan getPlanById(Integer planeId) {
		// TODO Auto-generated method stub
		Optional<Plan> findById = planRepo.findById(planeId);
		if(findById.isPresent())
		{
			return findById.get();
		}
		else {
			return null;
		}
	}

	@Override
	public boolean updatePlan(Plan plan) {
		// TODO Auto-generated method stub
		planRepo.save(plan);  //upsert method 
		return plan.getPlanId()!=null;
	}

	@Override
	public boolean deletePlanById(Integer planId) {
		boolean status = false;
		try {
			planRepo.deleteById(planId);
		status = true;
		}catch(Exception e)
		{
		e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean planStatusChange(Integer PlanId, String status) {
		// TODO Auto-generated method stuPlan plan = b
		Optional<Plan> findById = planRepo.findById(PlanId);
		if(findById.isPresent())
		{
			Plan plan = findById.get();
			plan.setActiveSw(status);
			planRepo.save(plan);
			return true;
		}
		return false;
		
	}

}
