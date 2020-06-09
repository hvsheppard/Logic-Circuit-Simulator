package logic;

public class NAND6 extends Gate_6_Input {

	public void energize() {
		if ((input1.getTerminalValue() == 1) 
			&& (input2.getTerminalValue() == 1)  
			&& (input3.getTerminalValue() == 1)  
			&& (input4.getTerminalValue() == 1)  
			&& (input5.getTerminalValue() == 1)  
			&& (input6.getTerminalValue() == 1))  
			output.setTerminalValue(0);
		else
			output.setTerminalValue(1);
	}
}
