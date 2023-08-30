package com.example.demo.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
//@Data
@Table(name="PLAN_MASTER")
public class Plan {

		@Id
		@GeneratedValue
		@Column(name = "PLAN_ID")
		private Integer planId;
		
		@Column(name="PLAN_NAME")
		private String planName;
		
		@Column (name="PLAN_STARTED_DATE")
		private LocalDate planStartedDate;
		
		@Column(name="PLAN_END_DATE")
		private LocalDate PlanEndDate;
		
		@Column(name="ACTIVE_SW")
		private String activeSw;
		
		@Column(name="PLAN_CATEGORY_ID")
		private Integer PlanCategoryId;

		public Integer getPlanId() {
			return planId;
		}

		public void setPlanId(Integer planId) {
			this.planId = planId;
		}

		public String getPlanName() {
			return planName;
		}

		public void setPlanName(String planName) {
			this.planName = planName;
		}

		public LocalDate getPlanStartedDate() {
			return planStartedDate;
		}

		public void setPlanStartedDate(LocalDate planStartedDate) {
			this.planStartedDate = planStartedDate;
		}

		public LocalDate getPlanEndDate() {
			return PlanEndDate;
		}

		public void setPlanEndDate(LocalDate planEndDate) {
			PlanEndDate = planEndDate;
		}

		public String getActiveSw() {
			return activeSw;
		}

		public void setActiveSw(String activeSw) {
			this.activeSw = activeSw;
		}

		public Integer getPlanCategoryId() {
			return PlanCategoryId;
		}

		public void setPlanCategoryId(Integer planCategoryId) {
			PlanCategoryId = planCategoryId;
		}

		public Plan(Integer planId, String planName, LocalDate planStartedDate, LocalDate planEndDate, String activeSw,
				Integer planCategoryId) {
			super();
			this.planId = planId;
			this.planName = planName;
			this.planStartedDate = planStartedDate;
			PlanEndDate = planEndDate;
			this.activeSw = activeSw;
			PlanCategoryId = planCategoryId;
		}

		public Plan() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Plan [planId=" + planId + ", planName=" + planName + ", planStartedDate=" + planStartedDate
					+ ", PlanEndDate=" + PlanEndDate + ", activeSw=" + activeSw + ", PlanCategoryId=" + PlanCategoryId
					+ "]";
		}
		
}
