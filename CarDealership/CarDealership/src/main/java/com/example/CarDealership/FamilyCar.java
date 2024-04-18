package com.example.CarDealership;

public class FamilyCar implements Car {
	String owner;
	Tyre tyre;
	public FamilyCar(Tyre tyre) {
		this.tyre=tyre;
	}
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "A family car"+tyre.tyreInfo();
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
