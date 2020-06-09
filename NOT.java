package logic;

public class NOT {

	protected Terminal input;
	protected Terminal output;

	public NOT() {
		input = new Terminal();
		output = new Terminal();
	}
	
	public Terminal getInput() {
		return input;
	}
	
	public Terminal getOutput() {
		return output;
	}
	
	public void setInputValue(int value) {
		input.setTerminalValue(value);
	}
	
	public void energize() {
		if ((input.getTerminalValue() == 1))  
			output.setTerminalValue(0);
		else
			output.setTerminalValue(1);
	}

}
