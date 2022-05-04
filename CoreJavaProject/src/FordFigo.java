
public class FordFigo {

	// properties
	String color;
	int modelNo;
	// 8 primitive data types, start with small letter
	// byte, byte b = 10;
	// short, short sh = 10;
	// int, int i = 10;
	// long, long l = 10;
	// float, float fl = 32.5f;
	// double, double d = 12.5;
	// boolean, boolean flag = true;
	// char, char ch = 'a';

	FordFigo(String color, int modelNo){
		this.color = color;
		this.modelNo = modelNo;
	}
	
	// methods
	
	
	boolean unlockCar() {
		// code to unlock car
		System.out.println("FordFigo is unlocked!");
		return true;
	}
	
	boolean lockCar() {
		// code to lock the car
		System.out.println("FordFigo is locked!");
		return true;
	}
	
	boolean applyBrakes() {
		System.out.println("FordFigo's brake is applied");
		return true;
	}
	
	boolean accelerate() {
		System.out.println("FordFigo is accelearted");
		return true;
	}
	
	
}
