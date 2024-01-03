package OOP;

class Temperature{
	private int temp;
	
	Temperature(){
		temp = 16;
		//Default Constructor
	}
	
	Temperature (int temp){
		this.temp = temp;
		//Overloaded Constructor
	}
	
	public void SetTemp(int t) {
		temp = t;
	}
	
	public String GetTemp() {
		return "Temperature = " + temp;
	}
	
	public void tempMessage() {
		System.out.println("Today's Temperature is: "+ temp);
	}
	
}

public class SetterGetterMethod {

	public static void main(String[] args) {
		
		
		
		Temperature t1 = new Temperature();
		t1.tempMessage();
		System.out.println(t1.GetTemp());
		
		
		t1.SetTemp(35);
		System.out.println("Now " + t1.GetTemp());
		
		t1.tempMessage();

	}

}
