package SatrJava103H104;

public class Truck extends Vehicle {
	private double CargoCapacity;
	public Truck(String OwnerName,String Brand,String Model,int Year,double CargoCapacity) {
		super(OwnerName, Brand, Model, Year);
		this.CargoCapacity=CargoCapacity;
	}
	public void SetSeatingCapacity(int SeatingCapacity) {
		this.CargoCapacity=CargoCapacity;
	}
	public double GetCargoCapacity() {
		return CargoCapacity;
		}

	@Override
	public void DisplayInfo() {
		System.out.println("Owner: "+GetOwnerName());
		System.out.println("Car :"+GetBrand() + "Model :"+ GetModel()+"Year"+ GetYear() );
		System.out.println(" Cargo Capacity: "+GetCargoCapacity());
	}
}
