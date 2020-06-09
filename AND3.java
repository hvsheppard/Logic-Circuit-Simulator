package logic;

public class AND3 extends Gate_3_Input {

	public void energize() {
		if ((input1.getTerminalValue() == 1) 
			&& (input2.getTerminalValue() == 1)  
			&& (input3.getTerminalValue() == 1))  
			output.setTerminalValue(1);
		else
			output.setTerminalValue(0);
	}
}
