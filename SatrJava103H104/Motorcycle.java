package SatrJava103H104;

public class Motorcycle extends Vehicle{
private int EngineSize;
public Motorcycle(String OwnerName,String Brand,String Model,int Year,int EngineSize) {
	super(OwnerName, Brand, Model, Year);
	this.EngineSize=EngineSize;
}
public void SetEngineSize(int EngineSize) {
	this.EngineSize=EngineSize;
}
public double GetEngineSize() {
	return EngineSize;
	}

public void DisplayInfo() {
	System.out.println("Owner: "+GetOwnerName());
	System.out.println("Car :"+GetBrand() + "Model :"+ GetModel()+"Year"+ GetYear() );
	System.out.println(" Engine Size: "+GetEngineSize()+"CC");
}
}
