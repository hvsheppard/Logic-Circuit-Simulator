package logic;

public class XOR extends Gate_2_Input {

	// XOR output is 1 if inputs are different, and 0 if they are the same
	public void energize() {
		if (input1.getTerminalValue() == input2.getTerminalValue()) {
			output.setTerminalValue(0);
		}
		else {
			output.setTerminalValue(1);
		}
	}
}
