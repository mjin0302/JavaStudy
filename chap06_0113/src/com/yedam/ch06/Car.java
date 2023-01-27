package com.yedam.ch06;

public class Car {
	//캡슐화는 필드에 모두 private를 건다
	
	private int speed;
	private int maxSpeed;
	private String model;
	
	//생성자 
	public Car(String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.speed = 0;
	}
	//get = 값을 읽어 오기위한 함수
	public String getModel() {
		return this.model;
	}
	
	public int getMaxSpeed( ) {
		return this.maxSpeed;
	}
	
	//set = 값을 집어 넣기위한 함수
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
		
}
