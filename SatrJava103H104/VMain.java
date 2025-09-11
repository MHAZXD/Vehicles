package SatrJava103H104;
import java.util.Scanner;
public class VMain {

	public static void main(String[] args) {
		Garage garage=new Garage();
		Scanner SC=new Scanner(System.in);
		int choice=0;
		do {
			
			System.out.println("Menu: ");
			System.out.println("1.Add a Vehicle");
			System.out.println("2.Update a Vehicle");
			System.out.println("3.Remove a Vehicle");
			System.out.println("4.Display Vehicles");
			System.out.println("5.Display Detalis of a Vehicles ");
			System.out.println("0.EXIT");
			
			System.out.println("Enter your choice: ");
			choice=SC.nextInt();
		
		
		
		switch (choice) {
		case 1: 
			System.out.println("Choose the vehicle type: ");
			System.out.println("1.Car");
			System.out.println("2.Motorcycle");
			System.out.println("3.Truck");
			System.out.println("Enter the vehicale (1-3)");
			
			int VehicaleChoice=SC.nextInt();
			
			switch(VehicaleChoice) {
			case 1:
			System.out.println("Enter Owner Name:");
			String CarOwner=SC.nextLine();
			System.out.println("Enter Vehicle Brand :");
			String CarBrand=SC.nextLine();
			System.out.println("Enter Vehicle Model:");
			String CarModel=SC.nextLine();
			System.out.println("Enter Vehicle year:");
			int CarYear=SC.nextInt();
			SC.nextLine();
			System.out.println("Enter Seating Capacity:");
			int SeatingCapacity=SC.nextInt();
			garage.addVehicle(new Car(CarOwner,CarBrand,CarModel,CarYear,SeatingCapacity));
			break;
			case 2:
				System.out.println("Enter Owner Name:");
				String MotorcycleOwner=SC.nextLine();
				System.out.println("Enter Vehicle Brand :");
				String MotorcycleBrand=SC.nextLine();
				System.out.println("Enter Vehicle Model:");
				String MotorcycleModel=SC.nextLine();
				System.out.println("Enter Vehicle year:");
				int MotorcycleYear=SC.nextInt();
				SC.nextLine();
				System.out.println("Enter Engine Size:");
				int EngineSize=SC.nextInt();
				garage.addVehicle(new Motorcycle(MotorcycleOwner,MotorcycleBrand,MotorcycleModel,MotorcycleYear,EngineSize));
				break;
				
			case 3:
				System.out.println("Enter Owner Name:");
				String TruckOwner=SC.nextLine();
				System.out.println("Enter Vehicle Brand :");
				String TruckBrand=SC.nextLine();
				System.out.println("Enter Vehicle Model:");
				String TruckModel=SC.nextLine();
				System.out.println("Enter Vehicle year:");
				int TruckYear=SC.nextInt();
				SC.nextLine();
				System.out.println("Enter Cargo Capacity: ");
				int CargoCapacity=SC.nextInt();
				garage.addVehicle(new Truck(TruckOwner,TruckBrand,TruckModel,TruckYear,CargoCapacity));
				break;
				default:
					System.out.println("Invalid vehicle type choice. ");
				
					break;
			}
		
		case 2:
			System.out.println("Enter owner name of the vehicle to update:");
			String UpdateOwener= SC.nextLine();
			System.out.println("Enter new owner name: ");
			String Owner=SC.nextLine();
			System.out.println("Enter new vehicle brand: ");
			String Brand=SC.nextLine();
			System.out.println("Enter new vehicle Model: ");
			String Model=SC.nextLine();
			System.out.println("Enter new vehicle Year: ");
			int Year=SC.nextInt();
			
			garage.UpdateVehicle(Brand, Model, Year, Owner, UpdateOwener);
			break;

		case 3:
			System.out.println("Enter Owner name of the vehicle to remobe: ");
			String RemoveOwner= SC.nextLine();
			garage.RemoveVehicle(RemoveOwner);
			break ;
		case 4:
			garage.DisplayVehicles();
			break;
			case 5:
				System.out.println("Enter Owner name of the vehicle to display  details: ");
				String DisplayOwner=SC.nextLine();
				garage.DisplayVehiclesDetails(DisplayOwner);
				break;
			case 0:
				System.out.println("Exiting the program Goodbye! ");
				break;
			
		default:
			System.out.println("Invalid choice . Please enter a valid option.");
			
		}
		
		} while (choice!=0);
		
		

	}

}
