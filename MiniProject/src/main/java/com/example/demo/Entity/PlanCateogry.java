package com.example.demo.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

//@Data
@Entity
@Table(name="PLAN_CATEOGRY")
public class PlanCateogry {
	
	@Id
	@Column(name = "CATEOGRY_ID")
	private Integer cateogryId;
	
	@Column(name = "CATEOGRY_NAME")
	private String  cateogryName;
	
	@Column(name = "ACTIVE_SW")
	private String activeSw;
	
	@Column(name = "CREATED_BY")
	private String createdBy;
	
	@Column(name = "UPDATED_BY")
	private String updatedBy;
	
	@Column(name = "CREATED_DATE", updatable= false)
	@CreationTimestamp
	private LocalDate createdDate;
	
	@UpdateTimestamp
	@Column(name = "UPDATED_DATE", insertable= false)
	private LocalDate updatedDate;

	public Integer getCateogryId() {
		return cateogryId;
	}

	public void setCateogryId(Integer cateogryId) {
		this.cateogryId = cateogryId;
	}

	public String getCateogryName() {
		return cateogryName;
	}

	public void setCateogryName(String cateogryName) {
		this.cateogryName = cateogryName;
	}

	public String getActiveSw() {
		return activeSw;
	}

	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	public PlanCateogry(Integer cateogryId, String cateogryName, String activeSw, String createdBy, String updatedBy,
			LocalDate createdDate, LocalDate updatedDate) {
		super();
		this.cateogryId = cateogryId;
		this.cateogryName = cateogryName;
		this.activeSw = activeSw;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public PlanCateogry() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PlanCateogry [cateogryId=" + cateogryId + ", cateogryName=" + cateogryName + ", activeSw=" + activeSw
				+ ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
	}


}
