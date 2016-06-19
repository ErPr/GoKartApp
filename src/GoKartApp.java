
public class GoKartApp {
	public static void main(String[] args) {
		GoKart kart = new GoKart("yellow");
		if (kart.isBatteryEmpty()) {
			System.out.println("The battery is empty");
		}
		kart.drive();
		kart.charge();
	}
}
