package Logic;

public class OR extends Gate_2_Input {

	public void evaluate() {
		if ((input1.getTerminalValue() == 1) || (input2.getTerminalValue() == 1)) {
			output.setTerminalValue(1);
		}
		else {
			output.setTerminalValue(0);
		}
	}
}