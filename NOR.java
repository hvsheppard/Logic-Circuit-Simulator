package Logic;

public class NOR extends Gate_2_Input {

	public void evaluate() {
		if ((input1.getTerminalValue() == 1) || (input2.getTerminalValue() == 1)) {
			output.setTerminalValue(0);
		}
		else {
			output.setTerminalValue(1);
		}
	}
}