package com.practice.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
//(name="hello")
@Entity
//@Table(name="kkk")
public class Student {
	
	public Student() {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	@Id
	private int id;//@Transient not stored in db
	private String name;//@Column(name="hhh")change col.name
	private String city;
	@OneToOne
//	private Laptop laptop;
//	
//	public Laptop getLaptop() {
//		return laptop;
//	}
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
