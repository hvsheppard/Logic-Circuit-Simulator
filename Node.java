package logic;

public class Node {

	protected Terminal output;
	protected Terminal input;

	public Node() {
		output = new Terminal();
		input = new Terminal();
	}
	
	public Terminal getOutput() {
		return output;
	}
	
	public Terminal getInput() {
		return input;
	}
	
	public void setOutputValue(int value) {
		output.setTerminalValue(value);
	}
	
	public void setInputValue(int value) {
		input.setTerminalValue(value);
	}
	
}
