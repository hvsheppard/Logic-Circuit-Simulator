package logic;

public class AND4 extends Gate_4_Input {

	public void energize() {
		if ((input1.getTerminalValue() == 1) 
			&& (input2.getTerminalValue() == 1)  
			&& (input3.getTerminalValue() == 1)  
			&& (input4.getTerminalValue() == 1))  
			output.setTerminalValue(1);
		else
			output.setTerminalValue(0);
	}
}
