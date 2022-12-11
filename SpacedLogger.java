package week5;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		for ( int x = 0; x < log.length(); x++) {
			System.out.print(log.charAt(x) + " ");
		} // end FOR
		System.out.println();			// added for carriage return after not using println
	} // end log

	@Override
	public void error(String error) {
		System.out.print("ERROR: ");
		for (int x = 0; x < error.length(); x++) {
			System.out.print(error.charAt(x) + " ");
		} // end FOR
		System.out.println();			// added for carriage return after not using println		
	} // end error

} // end CLASS
