package Logic;

public class AND extends Gate_2_Input {

	public void energize() {
		if ((input1.getTerminalValue() == 1) && (input2.getTerminalValue() == 1))  
			output.setTerminalValue(1);
		else
			output.setTerminalValue(0);
	}

}
