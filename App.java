package week5;

public class App {

	public static void main(String[] args) {

		AsteriskLogger asterLog = new AsteriskLogger();
		SpacedLogger errLog = new SpacedLogger();
		
		asterLog.log("Star washer print test");
		System.out.println(); 						// added for better looking white space
		asterLog.error("Star washers went flat!");
		System.out.println(); 						// added for better looking white space
		
		errLog.log("Deactivate stretch mode");
		System.out.println(); 						// added for better looking white space
		errLog.error("Stretch mode deactivation failed");
		System.out.println(); 						// added for better looking white space
		
	} // end MAIN

} // end CLASS
