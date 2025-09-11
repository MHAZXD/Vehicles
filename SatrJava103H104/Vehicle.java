package SatrJava103H104;

 public  abstract class Vehicle {
	 public static final String GetOwnerName = null;
	private String OwnerName;
	 private String Brand;
	 private String Model;
	 private int Year;
	 
public Vehicle(String OwnerName,String Brand,String Model,int Year) {
	this.OwnerName=OwnerName;
	this.Brand=Brand;
	this.Model=Model;
	this.Year=Year;
}
public void SetOwnerName(String OwnerName) {
	this.OwnerName=OwnerName ;
}
public String GetOwnerName() {
	return OwnerName;
	}
public void SetBrand(String Brand) {
	this.Brand=Brand ;
}
public String GetBrand() {
	return Brand;
	}
public void SetModel(String Model) {
	this.Model=Model ;
}
public String GetModel() {
	return Model;
	}
public void SetYear(int Year) {
	this.Year=Year ;
}
public int GetYear() {
	return Year;
	}
public void SetNewOwner(String newOwner) {
	// TODO Auto-generated method stub
	
}
public void DisplayInfo() {
	// TODO Auto-generated method stub
	
}
 }

