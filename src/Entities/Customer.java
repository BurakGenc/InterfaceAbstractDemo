package Entities;

import Abstract.IEntity;

public class Customer implements IEntity{
	private int Id;
	private String FirstName;
	private String LastName;
	private int year;
	private int month;
	private int day;
	private String NationalityId;
	
	
	
	
	public Customer(int id, String firstName, String lastName, int year, int month, int day, String nationalityId) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		this.year = year;
		this.month = month;
		this.day = day;
		NationalityId = nationalityId;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	
	
}
