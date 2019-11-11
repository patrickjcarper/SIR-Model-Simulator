interface SIRModelInputUI {
 /**
 * Queries the user to select a time
 *
 * @return the number of susceptible, infected, and recovered individuals present in the population at the selected time
 */
	
double inputTransmission();

double inputRecovery();

int inputTime();

}
