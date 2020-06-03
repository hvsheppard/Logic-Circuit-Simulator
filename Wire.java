package Logic;

public class Wire {

	private Terminal input;
	private Terminal output;
	
	public Wire() {
		input = new Terminal();
		output = new Terminal();
	}

	public void setInput(Terminal terminal) {
		input = terminal;
	}
	
	public void setOutput(Terminal terminal) {
		output = terminal;
	}
	
	public Terminal getInput() {
		return input;
	}
	
	public Terminal getOutput() {
		return output;
	}
	
	public void connect(Terminal inTerm, Terminal outTerm) {
		setInput(inTerm);
		setOutput(outTerm);
	}
	
	public void energize() {
		int value = input.getTerminalValue();
		output.setTerminalValue(value);
	}
}

