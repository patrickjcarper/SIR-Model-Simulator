import java.io.*;
import java.util.Scanner;


public class SIRModelConsoleInput implements SIRModelInputUI {

	PrintStream output = System.out;
	Scanner scanInput = null;
	
	double inputTransmission() {
		output.print("Please select a number between 0 and 1 to represent the transmission coefficient: ");
		double setTransmission = scanInput.nextDouble();
		while (setTransmission > 1 || setTransmission < 0) {
			output.print("Please select a number between 0 and 1 to represent the transmission coefficient: ");
			setTransmission = scanInput.nextDouble();
		}
		return setTransmission;
	}
	
	double inputRecovery() {
		output.print("Please select a number between 0 and 1 to represent the recovery coefficient: ");
		double setRecovery = scanInput.nextDouble();
		while (setRecovery > 1 || setRecovery < 0) {
			output.print("Please select a number between 0 and 1 to represent the recovery coefficient: ");
			setRecovery = scanInput.nextDouble();
		}
		return setRecovery;
	}
	
	int inputTime() {
		output.print("Please select the moment in time you want to inspect: ");
		int setTime = scanInput.nextInt();
		while (setTime < 0) {
			output.print("Please select the moment in time you want to inspect: ");
			setTime = scanInput.nextInt();
		}
		return setTime;
	}
}
