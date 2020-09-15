package Lab2.ques5;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 to create a Vehicle object.");
		System.out.println("Enter 2 to create a Car object.");
		System.out.println("Enter 3 to create a Convertible object.");
		System.out.println("Enter 4 to create a SportCar object.");
		int choice = sc.nextInt();
		sc.nextLine();
		System.out.println("Please Enter The make: ");
		String make = sc.nextLine();
		System.out.println("Please Enter The model: ");
		int model =sc.nextInt();
		System.out.println("Please Enter The no. of wheels: ");
		int noOfWheel=sc.nextInt();
		System.out.println("Please Enter The no. of passengers: ");
		int noOfPassenger=sc.nextInt();
		if(choice==1) {
			Vehicle v=new Vehicle(noOfWheel,noOfPassenger,model,make);
			v.display();
		}
		else if(choice == 2) {
			System.out.println("Enter no. of doors: ");
			int noOfDoor=sc.nextInt();
			Car c =new Car(noOfWheel,noOfPassenger,model,make,noOfDoor);
			c.display();
		}
		else if(choice == 3) {
			System.out.println("Enter no. of doors: ");
			int noOfDoor=sc.nextInt();
			System.out.println(" Is Hood opennable Please Enter True or False ");
			boolean isHoodOpen = sc.nextBoolean();
			Convertible c=new Convertible(noOfWheel,noOfPassenger,model,make,noOfDoor,isHoodOpen);
			c.display();
		}
		else if(choice == 4) {
			SportCar s=new SportCar(noOfWheel,noOfPassenger,model,make);
			s.display();
		}
		sc.close();

	}

}
