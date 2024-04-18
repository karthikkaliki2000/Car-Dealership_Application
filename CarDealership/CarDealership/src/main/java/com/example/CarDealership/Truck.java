package com.example.CarDealership;

public class Truck implements Car {
	String owner;
	Tyre tyre;
	
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	public Truck() {
		
	}
	public Truck(Tyre tyre) {
		
		this.tyre=tyre;
	}
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "A truck car"+tyre.tyreInfo();
	}

	@Override
	public void setOwnerName(String name) {
		// TODO Auto-generated method stub
		this.owner=name;

	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return this.owner;

	}

}
