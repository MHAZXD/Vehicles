package SatrJava103H104;

 public class Car extends Vehicle{
private int SeatingCapacity;
public Car(String OwnerName,String Brand,String Model,int Year,int SeatingCapacity) {
	super(OwnerName, Brand, Model, Year);
	this.SeatingCapacity=SeatingCapacity;
}
public void SetSeatingCapacity(int SeatingCapacity) {
	this.SeatingCapacity=SeatingCapacity;
}
public int GetSeatingCapacity() {
	return SeatingCapacity;
	}

@Override
public void DisplayInfo() {
	System.out.println("Owner: "+GetOwnerName());
	System.out.println("Car :"+GetBrand() + "Model :"+ GetModel()+"Year"+ GetYear() );
	System.out.println(" Seating Capacity: "+GetSeatingCapacity());
}
}
