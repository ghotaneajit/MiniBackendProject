package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Plan;
import com.example.demo.appProps.AppProps;
import com.example.demo.service.PlanServiceImpl;



@RestController
public class Controller {
	
	
		
		private PlanServiceImpl planServiceImpl;
		
		
		private AppProps appProps;
		Map<String,String> messages;
		  
		public Controller(PlanServiceImpl planServiceImpl, AppProps appProps) {
			this.planServiceImpl=planServiceImpl;
			this.messages=appProps.getMessage();
			System.out.println(this.messages);
		}
		
		
		@GetMapping("/categories")
		public ResponseEntity<Map<Integer, String>> getPlanCateogry()
		{
			Map<Integer, String> categories = planServiceImpl.getPlanCateogry();
			return new ResponseEntity <>(categories,HttpStatus.OK);
		}
		
		
		@PostMapping("/plan")
		public ResponseEntity<String> savePlan(@RequestBody Plan plan) {
			String responseMsg="";
			boolean isSave = planServiceImpl.savePlan(plan);
			if(isSave)
			{
				responseMsg = messages.get("planSaveSucc");
						
			}
			else {
				responseMsg = messages.get("planSaveFail");
			}
			return new ResponseEntity<>(responseMsg,HttpStatus.OK);
			
		}
		
		@GetMapping("/plans")
		public ResponseEntity<List<Plan>> plans()
		{
			List <Plan> plans = planServiceImpl.getAllPlans();
			return new ResponseEntity<>(plans, HttpStatus.OK);
		}
		
		@GetMapping("plan/{planId}")
		public ResponseEntity<Plan> editPlan(@PathVariable Integer planId)
		{
				
			Plan planById = planServiceImpl.getPlanById(planId);
			return new ResponseEntity<>(planById,HttpStatus.OK);
		}
		
		
		@PutMapping("/plan")
		public ResponseEntity<String> updatePlan(@RequestBody Plan plan)
		{
			String msg="";
		boolean isUpdated=planServiceImpl.updatePlan(plan);
		if(isUpdated)
		{
			msg = messages.get("planUpdateSucc");
		}
		else
		{
			msg = messages.get("planUpdateFail");
		}
		return new ResponseEntity<>(msg, HttpStatus.OK);
		}
		
		@DeleteMapping("plan/{planId}")
		public ResponseEntity<String> deletePlan(@PathVariable Integer planId)
		{
				String msg;
			boolean isDeleted = planServiceImpl.deletePlanById(planId);
		
			if(isDeleted)
			{
				msg = messages.get("PlanDeleteSucc");
			}
			else
			{
				msg = messages.get("PlanDeleteFail");
			}
			return new ResponseEntity<>(msg ,HttpStatus.OK);
		}
		
		
		@PutMapping("/Status-change/{planId}/{status}")
		public ResponseEntity<String> updateStatus(@PathVariable Integer planId,@PathVariable String status)
		{
				String msg="";
			
			boolean planStatusChange = planServiceImpl.planStatusChange(planId, status);
			if(planStatusChange)
			{
				 msg  = messages.get("planStatusChange");
			}
			else {
				msg = messages.get("planStatusChangFail");
			}
			return new ResponseEntity<>(msg,HttpStatus.OK);
		}	
		
		
		
	

}
