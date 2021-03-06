package com.example.demo3;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Bear {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private Double abv;
public Long getId() {
	return id;
}
public void setId(Long id) {
		System.out.println("id: " + id);
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getAbv() {
	return abv;
}
public void setAbv(Double abv) {
	this.abv = abv;
}

}
