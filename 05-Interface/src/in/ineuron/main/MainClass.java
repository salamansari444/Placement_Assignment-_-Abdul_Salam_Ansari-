package in.ineuron.main;

interface Car{
	public void carName(); // abstract method
	public void carPrice();  // abstract method
	public void carModel();  // abstract method
	
	
}

//this class i make as abstract beacause its implementing the feature from interface Car, so interface has rule 
//that if anyclass wants to implement then make sure all feature should overrid otherwish make class as abstract
abstract class Mercedez implements Car{

	@Override
	public void carName() {
		System.out.println("Mercedez car");
		
	}

	@Override
	public void carPrice() {
		System.out.println("Car Price is 240000 $");
		
	}
	public void showroomPrice() {  // non abstract method
		System.out.println("260000$");
	}
	
}

abstract class BMW implements Car{
	
}



public class MainClass implements Car{

	@Override
	public void carName() {
		System.out.println("Audi");
		
	}

	@Override
	public void carPrice() {
		System.out.println("500000$");
		
	}

	@Override
	public void carModel() {
		System.out.println("ABN-456");
		
	}

}
