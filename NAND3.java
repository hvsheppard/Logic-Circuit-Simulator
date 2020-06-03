package Logic;

public class NAND3 extends Gate_3_Input {

	public void evaluate() {
		if ((input1.getTerminalValue() == 1) 
			&& (input2.getTerminalValue() == 1)  
			&& (input3.getTerminalValue() == 1))  
			output.setTerminalValue(0);
		else
			output.setTerminalValue(1);
	}
}
