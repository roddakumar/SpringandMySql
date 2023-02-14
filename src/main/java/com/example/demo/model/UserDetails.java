package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(schema="person" , name = "details")
public class UserDetails {
      @Id
      
	  @Column(name = "detail_id")
      private Integer Did;

	 @Column(name = "p_num")
	  private String phoneNum;
	
	

	public Integer getDid() {
		return Did;
	}

	public void setDid(Integer did) {
		Did = did;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
}
