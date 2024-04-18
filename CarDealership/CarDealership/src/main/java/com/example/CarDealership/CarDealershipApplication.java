package com.example.CarDealership;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CarDealershipApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//SpringApplication.run(CarDealershipApplication.class, args);
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Scanner s=new Scanner(System.in);
		System.out.println("Hi, Please enter you name");
		String name=s.nextLine();
		System.out.println("Please select your car of choice");
		System.out.println("1.family car\n2.sports car\n3.truck");
		int type=s.nextInt();
		Car car = null;
		switch(type) {
		case 1:{
			//car=(Car)context.getBean("familyCar");
			System.out.println("Please enter your tyre choice\n1.Normal tyres\n2.SportsTyres");
			int tyreChoice=s.nextInt();
			switch(tyreChoice) {
			case 1:{
				car=(Car)context.getBean("familyCarNormalTyres");
				break;
			}
			case 2:{
				car=(Car)context.getBean("familyCarSportsTyres");
				break;
			}
			default:
				System.out.println("Invalid tyre choice");
			}
			break;
		}
			
		case 2:
		{
			//car=(Car)context.getBean("sportsCar");
			System.out.println("Please enter your tyre choice\n1.HeavyTyres tyres\n2.SportsTyres");
			int tyreChoice=s.nextInt();
			switch(tyreChoice) {
			case 1:{
				car=(Car)context.getBean("sportsCarHeavyTyres");
				break;
			}
			case 2:{
				car=(Car)context.getBean("sportsCarSportsTyres");
				break;
			}
			default:
				System.out.println("Invalid tyre choice");
			}
			break;
			
		}
		case 3:
		{
			//car=(Car)context.getBean("truck");
			System.out.println("Please enter your tyre choice\n1.HeavyTyres\n2.SportsTyres");
			int tyreChoice=s.nextInt();
			switch(tyreChoice) {
			case 1:{
				car=(Car)context.getBean("truckHeavyTyres");
				break;
			}
			case 2:{
				car=(Car)context.getBean("truckSportsTyres");
				break;
			}
			default:
				System.out.println("Invalid tyre choice");
			}
			break;
		}
		default:
			System.out.println("Wrong!");
		}
		car.setOwnerName(name);
		System.out.println(car.getOwnerName()+" owns "+car.getInfo());
	
	}

}
