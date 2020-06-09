package logic;

public class XNOR extends Gate_2_Input {

	// XNOR output is 0 if inputs are different, and 1 if they are the same
	// i.e. the opposite of XOR
	public void energize() {
		if (input1.getTerminalValue() == input2.getTerminalValue()) {
			output.setTerminalValue(1);
		}
		else {
			output.setTerminalValue(0);
		}
	}
}
