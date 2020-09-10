package com.JinglunZhou.JobSearchManagementSystem.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	
	@ManyToOne
	@JoinColumn(name="countryid",insertable=false,updatable=false)
	private Country country;
	private Integer countryid;
	
	@ManyToOne
	@JoinColumn(name="stateid",insertable=false,updatable=false)
	private State state;
	private Integer stateid;
	
	
	private String city;
	
	@OneToMany(mappedBy="company")
	private List<Job> jobs;
	

	

}
